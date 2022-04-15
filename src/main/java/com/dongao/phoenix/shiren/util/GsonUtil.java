package com.dongao.phoenix.shiren.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * Created by Goober on 2018/1/4.
 */
public class GsonUtil {

    public static <T> T fromJson(String json, Type typeOfT) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, typeOfT);
    }
    public static String toJson(Object src) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(src);
    }
}
