
package com.example.myapp.network_library.model;

import com.squareup.moshi.Json;

import java.util.List;

public class WeatherMainEntity {

    @Json(name = "coord")
    private CoordinatesEntity coord;
    @Json(name = "weather")
    private List<WeatherEntity> weather = null;
    @Json(name = "base")
    private String base;
    @Json(name = "main")
    private TemperatureEntity main;
    @Json(name = "wind")
    private WindEntity wind;
    @Json(name = "clouds")
    private CloudsEntity clouds;
    @Json(name = "dt")
    private int dt;
    @Json(name = "sys")
    private SunriseEntity sys;
    @Json(name = "id")
    private int id;
    @Json(name = "name")
    private String name;
    @Json(name = "cod")
    private int cod;

    public CoordinatesEntity getCoord() {
        return coord;
    }

    public void setCoord(CoordinatesEntity coord) {
        this.coord = coord;
    }

    public List<WeatherEntity> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherEntity> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public TemperatureEntity getMain() {
        return main;
    }

    public void setMain(TemperatureEntity main) {
        this.main = main;
    }

    public WindEntity getWind() {
        return wind;
    }

    public void setWind(WindEntity wind) {
        this.wind = wind;
    }

    public CloudsEntity getClouds() {
        return clouds;
    }

    public void setClouds(CloudsEntity clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public SunriseEntity getSys() {
        return sys;
    }

    public void setSys(SunriseEntity sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

}
