package com.company.circle;

public class Circle {

    //region Properties
    private double radius;
    //endregion

    //region Constructors
    Circle() {
    }

    Circle(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Enter valid radius.");
        }
    }
    //endregion

    //region Public Methods
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    //endregion

    //region Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Enter valid radius.");
        }
    }
    //endregion
}