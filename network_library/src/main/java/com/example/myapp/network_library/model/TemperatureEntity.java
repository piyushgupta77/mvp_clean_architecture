
package com.example.myapp.network_library.model;

import com.squareup.moshi.Json;

public class TemperatureEntity {

    @Json(name = "temp")
    private double temp;
    @Json(name = "pressure")
    private double pressure;
    @Json(name = "humidity")
    private int humidity;
    @Json(name = "temp_min")
    private double tempMin;
    @Json(name = "temp_max")
    private double tempMax;
    @Json(name = "sea_level")
    private double seaLevel;
    @Json(name = "grnd_level")
    private double grndLevel;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public double getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(double grndLevel) {
        this.grndLevel = grndLevel;
    }

}
