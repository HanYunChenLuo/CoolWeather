package com.huami.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Hourly {

    @SerializedName("cloud")
    public String cloud;

    @SerializedName("cond_code")
    public String cond_code;

    @SerializedName("cond_txt")
    public String cond_txt;

    @SerializedName("hum")
    public String hum;

    @SerializedName("pop")
    public String pop;

    @SerializedName("pres")
    public String pres;

    @SerializedName("time")
    public String time;

    @SerializedName("tmp")
    public String tmp;

    @SerializedName("wind_deg")
    public String wind_deg;

    @SerializedName("wind_dir")
    public String wind_dir;

    @SerializedName("wind_sc")
    public String wind_sc;

    @SerializedName("wind_spd")
    public String wind_spd;
}
