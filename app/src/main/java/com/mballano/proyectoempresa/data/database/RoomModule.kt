package com.mballano.proyectoempresa.data.database
/*
import android.content.Context
import androidx.room.Room
import com.mballano.proyectoempresa.ui.PostDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    private val POST_DATABASE_NAME = "post_database"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, PostDatabase::class.java, POST_DATABASE_NAME)


    @Singleton
    @Provides
    fun providePostDao(db: PostDatabase) = db.getPostDao()
}*/