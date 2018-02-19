
package com.example.myapp.network_library.model;

import com.squareup.moshi.Json;

public class CoordinatesEntity {

    @Json(name = "lon")
    private double lon;
    @Json(name = "lat")
    private double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

}
