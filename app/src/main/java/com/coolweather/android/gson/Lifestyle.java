package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by I333153 on 10/31/2017.
 */

public class Lifestyle {
    @SerializedName("type")
    public String  lifetype;
    @SerializedName("brf")
    public String  comfort;
    @SerializedName("txt")
    public String suggestion;

}
