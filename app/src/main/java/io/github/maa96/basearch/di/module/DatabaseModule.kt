package io.github.maa96.basearch.di.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import io.github.maa96.data.source.db.AppDataBase
import javax.inject.Singleton

@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(context: Context): AppDataBase = AppDataBase.getInstance(context)

    @Provides
    @Singleton
    fun providePointOfInterestDao(db: AppDataBase) = db.pointOfInterestDao()
}