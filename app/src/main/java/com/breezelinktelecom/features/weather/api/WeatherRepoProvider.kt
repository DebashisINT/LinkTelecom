package com.breezelinktelecom.features.weather.api

import com.breezelinktelecom.features.task.api.TaskApi
import com.breezelinktelecom.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}