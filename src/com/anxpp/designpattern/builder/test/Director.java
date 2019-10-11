package com.anxpp.designpattern.builder.test;

public class Director {
    private Builder mBuilder = null; 
    public Director(Builder builder) { 
        mBuilder = builder; 
    } 
    public Bike construct() { 
        mBuilder.buildFrame(); 
        mBuilder.buildSeat(); 
        mBuilder.buildTire(); 
        return mBuilder.createBike(); 
    } 
}