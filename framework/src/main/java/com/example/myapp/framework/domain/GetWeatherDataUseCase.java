package com.example.myapp.framework.domain;

import com.example.myapp.framework.base.BaseUseCase;
import com.example.myapp.framework.base.UseCaseComposer;
import com.example.myapp.framework.data.repositories.GetWeatherDataRepository;
import com.example.myapp.network_library.model.WeatherMainEntity;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetWeatherDataUseCase extends BaseUseCase<WeatherMainEntity> {

    private final GetWeatherDataRepository mGetWeatherDataRepository;

    @Inject
    GetWeatherDataUseCase(UseCaseComposer useCaseComposer, GetWeatherDataRepository getWeatherDataRepository) {
        super(useCaseComposer);
        this.mGetWeatherDataRepository = getWeatherDataRepository;
    }

    @Override
    protected Observable<WeatherMainEntity> createObservable() {
        return mGetWeatherDataRepository.getWeatherData();
    }
}
