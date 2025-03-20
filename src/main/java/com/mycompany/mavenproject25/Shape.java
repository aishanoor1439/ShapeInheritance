package com.mycompany.mavenproject25;

public abstract class Shape {

//    Attributes
    protected double area;

//Methods
    public Shape() {
        this.area = 0.0;
    }

    public double getArea() {
        return area;
    }

    public abstract void onAreaChange();

}
