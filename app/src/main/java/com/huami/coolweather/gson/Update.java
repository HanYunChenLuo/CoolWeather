package com.huami.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Update {

    @SerializedName("loc")
    public String updateTime_loc;

    @SerializedName("utc")
    public String updateTime_utc;

}
