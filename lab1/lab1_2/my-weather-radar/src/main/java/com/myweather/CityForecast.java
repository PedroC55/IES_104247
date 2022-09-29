package com.myweather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * the data point with the forecast for a city in a day
 */
public class CityForecast {

    @SerializedName("precipitaProb")
    @Expose
    private String precipitaProb;
    @SerializedName("tMin")
    @Expose
    private String tMin;
    @SerializedName("tMax")
    @Expose
    private String tMax;
    @SerializedName("predWindDir")
    @Expose
    private String predWindDir;
    @SerializedName("idWeatherType")
    @Expose
    private Integer idWeatherType;
    @SerializedName("classWindSpeed")
    @Expose
    private Integer classWindSpeed;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("forecastDate")
    @Expose
    private String forecastDate;
    @SerializedName("latitude")
    @Expose
    private String latitude;

    public String getPrecipitaProb() {
        return precipitaProb;
    }

    public void setPrecipitaProb(String precipitaProb) {
        this.precipitaProb = precipitaProb;
    }

    public String getTMin() {
        return tMin;
    }

    public void setTMin(String tMin) {
        this.tMin = tMin;
    }

    public String getTMax() {
        return tMax;
    }

    public void setTMax(String tMax) {
        this.tMax = tMax;
    }

    public String getPredWindDir() {
        return predWindDir;
    }

    public void setPredWindDir(String predWindDir) {
        this.predWindDir = predWindDir;
    }

    public Integer getIdWeatherType() {
        return idWeatherType;
    }

    public void setIdWeatherType(Integer idWeatherType) {
        this.idWeatherType = idWeatherType;
    }

    public Integer getClassWindSpeed() {
        return classWindSpeed;
    }

    public void setClassWindSpeed(Integer classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
