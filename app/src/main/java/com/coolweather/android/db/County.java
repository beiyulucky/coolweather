package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by I333153 on 10/19/2017.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private int weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }
}
