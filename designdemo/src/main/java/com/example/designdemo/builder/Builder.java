package com.example.designdemo.builder;

public abstract class Builder {

    public abstract Builder buildOs(String os);
    public abstract Builder buildBroad(String broad);
    public abstract Builder buildDisplay(String display);
    public abstract Computer build();


}
