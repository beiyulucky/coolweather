package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by I333153 on 10/30/2017.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;
    @SerializedName("cid")
    public String weatherId;

}
