package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by I333153 on 11/5/2017.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public  Update update;
    @SerializedName("lifestyle")
    public List<Lifestyle>lifestyle;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
