package com.example.stockui.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StocksModel {

    @SerializedName("stockName")
    @Expose
    public int stockName;

    @SerializedName("currentPrice")
    @Expose
    public int currentPrice;

    @SerializedName("dayChangeP")
    @Expose
    public int dayChangeP;

    @SerializedName("yearChangeP")
    @Expose
    public int yearChangeP;

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getDayChangeP() {
        return dayChangeP;
    }

    public void setDayChangeP(int dayChangeP) {
        this.dayChangeP = dayChangeP;
    }

    public int getYearChangeP() {
        return yearChangeP;
    }

    public void setYearChangeP(int yearChangeP) {
        this.yearChangeP = yearChangeP;
    }

    public int getStockName() {
        return stockName;
    }

    public void setStockName(int stockName) {
        this.stockName = stockName;
    }

}