package com.mycompany.mavenproject25;

public class Circle extends Shape {

//    Attributes
    private double radius;
    private final double PI = 3.14159;

//    Methods
    public Circle() {
        this.radius = 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        onAreaChange();
    }

    @Override
    public void onAreaChange() {
        this.area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
