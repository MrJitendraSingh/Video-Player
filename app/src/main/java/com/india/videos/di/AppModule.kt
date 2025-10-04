package com.india.videos.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.india.videos.core.uitls.Const
import com.india.videos.data.repository.VideoRepositoryImpl
import com.india.videos.data.room.LocalDB
import com.india.videos.data.room.VideoDao
import com.india.videos.domain.repository.VideoRepository
import com.india.videos.domain.usecase.AddToFavoritesUseCase
import com.india.videos.domain.usecase.GetFavoriteVideosUseCase
import com.india.videos.domain.usecase.GetPlaybackStateUseCase
import com.india.videos.domain.usecase.GetVideosByFolderUseCase
import com.india.videos.domain.usecase.SavePlaybackStateUseCase
import com.india.videos.domain.usecase.VideoUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    // Provide Application Context
    @Singleton
    @Provides
    fun provideAppContext(context: Application) : Context = context

    // Provide Room Database
    @Singleton
    @Provides
    fun provideLocalDB(context: Context) : LocalDB =  Room.databaseBuilder(
        context,
        LocalDB::class.java,
        Const.LOCAL_DB
    ).build()


    // Provide DAO
    @Provides
    fun provideVideoDao(db: LocalDB): VideoDao = db.videoDao()

    // Provide Repository
    @Provides
    @Singleton
    fun provideVideoRepository(dao: VideoDao): VideoRepository =
        VideoRepositoryImpl(dao)

    // Provide UseCases
    @Provides
    @Singleton
    fun provideVideoUseCases(repository: VideoRepository) = VideoUseCases(
        getVideosByFolder = GetVideosByFolderUseCase(repository),
        getPlaybackState = GetPlaybackStateUseCase(repository),
        savePlaybackState = SavePlaybackStateUseCase(repository),
        addToFavorites = AddToFavoritesUseCase(repository),
        getFavoriteVideos = GetFavoriteVideosUseCase(repository)
    )

}