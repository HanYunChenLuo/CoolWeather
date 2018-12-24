package com.huami.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    @SerializedName("lat")
    public String latitude;

    @SerializedName("lon")
    public String lontitude;

    @SerializedName("parent_city")
    public String parentCity;

    @SerializedName("admin_area")
    public String adminArea;

    @SerializedName("cnty")
    public String cnty;

    @SerializedName("tz")
    public String tz;

}
