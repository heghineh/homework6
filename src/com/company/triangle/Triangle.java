package com.company.triangle;

public class Triangle {

    //region Properties
    private int sideA;
    private int sideB;
    private int sideC;
    //endregion

    //region Constructors
    Triangle() {
    }

    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    //endregion

    //region Public Methods
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.pow(p * (p - sideA) * (p - sideB) * (p - sideC), 0.5);
    }
    //endregion

    //region Getters and Setters
    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    //endregion
}
