package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by I333153 on 10/31/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String info;

}
