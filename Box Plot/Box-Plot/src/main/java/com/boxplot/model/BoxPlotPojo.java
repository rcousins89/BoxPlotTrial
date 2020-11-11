package com.boxplot.model;

public class BoxPlotPojo {


    int traderId;
    int value;
    int spread;
    String traderName;


    public BoxPlotPojo(){

    }

    public BoxPlotPojo(int traderId, int value, int spread, String traderName) {
        this.traderId = traderId;
        this.value = value;
        this.spread = spread;
        this.traderName = traderName;
    }

    public int getTraderId() {
        return traderId;
    }

    public void setTraderId(int traderId) {
        this.traderId = traderId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSpread() {
        return spread;
    }

    public void setSpread(int spread) {
        this.spread = spread;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public String toString() {
        return "BoxPlotPojo{" +
                "traderId=" + traderId +
                ", value=" + value +
                ", spread=" + spread +
                ", traderName='" + traderName + '\'' +
                '}';
    }
}
