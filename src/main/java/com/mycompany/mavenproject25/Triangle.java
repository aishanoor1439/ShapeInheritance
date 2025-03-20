package com.mycompany.mavenproject25;

public class Triangle extends Shape {

//    Attributes
    private double height;
    private double base;

//    Methods
    public Triangle() {
        this.height = 0.0;
        this.base = 0.0;
    }

    public void setHeight(double height) {
        this.height = height;
        onAreaChange();
    }

    public void setBase(double base) {
        this.base = base;
        onAreaChange();
    }

    @Override
    public void onAreaChange() {
        this.area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

}
