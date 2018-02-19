package com.example.myapp.network_library.network.api;

import com.example.myapp.network_library.model.WeatherMainEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GetWeatherApi {

    @GET("data/2.5/weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1")
    Observable<WeatherMainEntity> getWeatherData();
}
