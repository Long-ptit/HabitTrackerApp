package com.example.createbaseproject.di

import com.example.createbaseproject.common.Logger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoroutinesDispatcherModule {

    @Provides
    @DefaultDispatcher
    fun providesDefaultDispathcer() = Dispatchers.Default

    @Provides
    @MainDispatcher
    fun providesMainDispathcer() = Dispatchers.Main

    @Provides
    @IoDispatcher
    fun providesIoDispathcer(): CoroutineDispatcher {
        Logger.log("Init dispathcher")
        return Dispatchers.IO
    }

    @Provides
    @MainImmediateDispatcher
    fun providesMainIntermediateDispathcer() = Dispatchers.Main.immediate



}