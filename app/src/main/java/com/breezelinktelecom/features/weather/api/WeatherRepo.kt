package com.breezelinktelecom.features.weather.api

import com.breezelinktelecom.base.BaseResponse
import com.breezelinktelecom.features.task.api.TaskApi
import com.breezelinktelecom.features.task.model.AddTaskInputModel
import com.breezelinktelecom.features.weather.model.ForeCastAPIResponse
import com.breezelinktelecom.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}