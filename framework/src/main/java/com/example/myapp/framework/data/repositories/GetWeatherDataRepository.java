package com.example.myapp.framework.data.repositories;

import com.example.myapp.network_library.model.WeatherMainEntity;
import com.example.myapp.network_library.network.api.GetWeatherApi;
import com.example.myapp.network_library.network.client.NetworkClient;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetWeatherDataRepository {

    private final NetworkClient networkClient;

    @Inject
    GetWeatherDataRepository(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    public Observable<WeatherMainEntity> getWeatherData() {
        return networkClient.create(GetWeatherApi.class).getWeatherData();
    }
}
