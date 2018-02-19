
package com.example.myapp.network_library.model;

import com.squareup.moshi.Json;

public class WindEntity {

    @Json(name = "speed")
    private double speed;
    @Json(name = "deg")
    private int deg;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

}
