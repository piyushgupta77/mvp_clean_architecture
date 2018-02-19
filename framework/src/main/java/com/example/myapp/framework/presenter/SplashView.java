package com.example.myapp.framework.presenter;

import com.example.myapp.framework.base.BaseView;
import com.example.myapp.network_library.model.WeatherMainEntity;

public interface SplashView extends BaseView{
    void showSuccess(WeatherMainEntity weatherMainEntity);

    void showError();
}
