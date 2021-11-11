package com.merholg.difficultapp;

public class State {

    private String region; // регион
    private String capital;  // город
    private int flagResource; // ресурс флага

    public State(String region, String capital, int flag){

        this.region=region;
        this.capital=capital;
        this.flagResource=flag;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}