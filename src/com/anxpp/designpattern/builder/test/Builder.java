package com.anxpp.designpattern.builder.test;

// 抽象 builder 类
public abstract class Builder { 
    abstract void buildFrame(); 
    abstract void buildSeat(); 
    abstract void buildTire(); 
    abstract Bike createBike(); 
}