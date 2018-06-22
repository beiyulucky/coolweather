package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by I333153 on 10/20/2017.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client =  new OkHttpClient();
        Request  request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
