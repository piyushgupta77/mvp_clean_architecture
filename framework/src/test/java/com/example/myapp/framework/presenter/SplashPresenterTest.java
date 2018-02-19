package com.example.myapp.framework.presenter;

import com.example.myapp.framework.domain.GetWeatherDataUseCase;
import com.example.myapp.network_library.model.WeatherMainEntity;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import io.reactivex.Observable;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SplashPresenterTest {

    @InjectMocks
    SplashPresenter mSplashPresenter;

    @Mock
    SplashView mSplashView;

    @Mock
    GetWeatherDataUseCase mGetWeatherDataUseCase;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mSplashPresenter.bind(mSplashView);
    }

    @Test
    public void testGetWeatherData() {
        WeatherMainEntity weatherMainEntity = new WeatherMainEntity();
        when(mGetWeatherDataUseCase.executeUseCase()).thenReturn(Observable.just(weatherMainEntity));
        mSplashPresenter.getWeatherData();
        verify(mSplashView).showSuccess(weatherMainEntity);
    }

}
