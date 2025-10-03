package com.india.videos.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.india.videos.core.uitls.Const
import com.india.videos.data.room.LocalDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Singleton
    @Provides
    fun provideAppContext(context: Application) : Context = context


    @Singleton
    @Provides
    fun provideLocalDB(context: Context) : LocalDB =  Room.databaseBuilder(
        context,
        LocalDB::class.java,
        Const.LOCAL_DB
    ).build()

}