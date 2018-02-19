
package com.example.myapp.network_library.model;

import com.squareup.moshi.Json;

public class WeatherEntity {

    @Json(name = "id")
    private int id;
    @Json(name = "main")
    private String main;
    @Json(name = "description")
    private String description;
    @Json(name = "icon")
    private String icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
