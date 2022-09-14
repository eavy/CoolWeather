package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    private static final String TAG = "HttpUtil";
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        Log.i(TAG, "sendOkHttpRequest: address " + address);
        OkHttpClient client = new OkHttpClient();
        Log.i(TAG, "sendOkHttpRequest: client " + client);
        Request request = new Request.Builder().url(address).build();
        Log.i(TAG, "sendOkHttpRequest: request " + request);
        client.newCall(request).enqueue(callback);
    }
}
