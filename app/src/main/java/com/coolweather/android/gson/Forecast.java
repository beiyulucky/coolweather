package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by I333153 on 11/5/2017.
 */

public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("cond_txt_d")
    public  String info;
    @SerializedName("tmp_max")
    public String temperatureMax;
    @SerializedName("tmp_min")
    public String temperatureMin;

}
