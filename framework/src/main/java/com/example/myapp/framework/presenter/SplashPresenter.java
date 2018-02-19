package com.example.myapp.framework.presenter;

import com.example.myapp.framework.base.BasePresenter;
import com.example.myapp.framework.domain.GetWeatherDataUseCase;

import javax.inject.Inject;

public class SplashPresenter extends BasePresenter<SplashView>  {

    private final GetWeatherDataUseCase getWeatherDataUseCase;

    @Inject
    SplashPresenter(GetWeatherDataUseCase getWeatherDataUseCase) {
        this.getWeatherDataUseCase =getWeatherDataUseCase;
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
    }

    public void getWeatherData() {
        getWeatherDataUseCase.executeUseCase()
                .compose(bindToLifeCycle())
                .subscribe( weatherMainEntity -> {
                    view.showSuccess(weatherMainEntity);
                }, throwable -> {
                    view.showError();
                });
    }
}
