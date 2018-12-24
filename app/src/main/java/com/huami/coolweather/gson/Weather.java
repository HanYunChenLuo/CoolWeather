package com.huami.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    @SerializedName("basic")
    public Basic basic;

    @SerializedName("status")
    public String status;

    @SerializedName("now")
    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("hourly")
    public List<Hourly> hourlyList;

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;

    @SerializedName("update")
    public Update update;
}
