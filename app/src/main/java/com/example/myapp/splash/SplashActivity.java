package com.example.myapp.splash;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapp.R;
import com.example.myapp.base.BaseActivity;
import com.example.myapp.di.AppDI;
import com.example.myapp.framework.presenter.SplashPresenter;
import com.example.myapp.framework.presenter.SplashView;
import com.example.myapp.network_library.model.WeatherEntity;
import com.example.myapp.network_library.model.WeatherMainEntity;

import java.util.List;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashView {

    private static final String TAG = SplashActivity.class.getCanonicalName();

    @Inject
    SplashPresenter mMainPresenter;

    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = (TextView) findViewById(R.id.tv_info);
        AppDI.getActivityComponent(this).inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMainPresenter.bind(this);
        mMainPresenter.getWeatherData();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMainPresenter.unbind();
    }

    @Override
    public void showSuccess(WeatherMainEntity weatherMainEntity) {
        Log.d(TAG, "success");
        List<WeatherEntity> weatherList = weatherMainEntity.getWeather();
        if (weatherList != null && weatherList.size() > 0) {
            tvInfo.setText("Today is " + weatherList.get(0).getDescription());
        }
    }

    @Override
    public void showError() {
        Log.d(TAG, "failure");
    }
}
