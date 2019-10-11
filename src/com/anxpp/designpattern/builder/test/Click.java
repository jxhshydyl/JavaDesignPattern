package com.anxpp.designpattern.builder.test;

public class Click {
    public static void main(String[] args) { 
        showBike(new OfoBuilder()); 
        showBike(new MobikeBuilder()); 
    } 
    private static void showBike(Builder builder) {
        Director director = new Director(builder); 
        Bike bike = director.construct(); 
        bike.getFrame().frame(); 
        bike.getSeat().seat(); 
        bike.getTire().tire(); 
    } 
}