package com.mycompany.mavenproject25;

public class Rectangle extends Shape {

//    Attributes
    private double height;
    private double width;

//    Methods
    public Rectangle() {
        this.height = 0.0;
        this.width = 0.0;
    }

    public void setHeight(double height) {
        this.height = height;
        onAreaChange();
    }

    public void setWidth(double width) {
        this.width = width;
        onAreaChange();
    }

    @Override
    public void onAreaChange() {
        this.area = height * width;
        System.out.println("Area of Rectangle: " + area);
    }

}
