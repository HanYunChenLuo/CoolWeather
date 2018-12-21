package com.huami.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.huami.coolweather.db.City;
import com.huami.coolweather.db.County;
import com.huami.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {

    private final String TAG = "Utility";

    /**
     * 解析与处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i = 0; i < allProvinces.length(); i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    Log.i("Utility", "provinceName = " + province.getProvinceName());
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析与处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response, int provinceId){
        Log.i("Utility", "handleCityResponse");
        if(!TextUtils.isEmpty(response)) {
            try{
                JSONArray allCities = new JSONArray(response);
                for(int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    Log.i("Utility", "cityName = " + city.getCityName());
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析与处理服务器返回的县级数据
     */

    public static boolean handleCountyResponse(String response, int cityId) {
        Log.i("Utility", "handleCountyResponse");
        if(!TextUtils.isEmpty(response)) {
            try{
                JSONArray allCounties = new JSONArray(response);
                for(int i = 0; i < allCounties.length(); i++){
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    Log.i("Utility", "countyName = " + county.getCountyName());
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
