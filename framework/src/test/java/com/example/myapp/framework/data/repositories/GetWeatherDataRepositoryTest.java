package com.example.myapp.framework.data.repositories;

import com.example.myapp.network_library.model.WeatherMainEntity;
import com.example.myapp.network_library.network.api.GetWeatherApi;
import com.example.myapp.network_library.network.client.NetworkClient;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import io.reactivex.Observable;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GetWeatherDataRepositoryTest {

    @InjectMocks
    GetWeatherDataRepository mGetWeatherDataRepository;

    @Mock
    NetworkClient mNetworkClient;

    @Mock
    GetWeatherApi mGetWeatherApi;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetWeatherData() {

        WeatherMainEntity weatherMainEntity = new WeatherMainEntity();
        when(mNetworkClient.create(GetWeatherApi.class)).thenReturn(mGetWeatherApi);
        when(mGetWeatherApi.getWeatherData()).thenReturn(Observable.just(weatherMainEntity));
        mGetWeatherDataRepository.getWeatherData();
        verify(mGetWeatherApi).getWeatherData();
    }
}
