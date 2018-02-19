
package com.example.myapp.network_library.model;

import com.squareup.moshi.Json;

public class SunriseEntity {

    @Json(name = "message")
    private double message;
    @Json(name = "country")
    private String country;
    @Json(name = "sunrise")
    private int sunrise;
    @Json(name = "sunset")
    private int sunset;

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

}
