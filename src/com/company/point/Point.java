package com.company.point;

public class Point {

    //region Properties
    private int coordinateX;
    private int coordinateY;
    //endregion

    //region Constructors
    Point() {
    }

    Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    //endregion

    //region Public methods
    public double distance() {
        return Math.pow(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2), 0.5);
    }

    public double distance(Point point) {
        return Math.pow((Math.pow((coordinateX - point.coordinateX), 2) +
                Math.pow((coordinateY - point.coordinateY), 2)), 0.5);
    }
    //endregion

    //region Getters and Setters
    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    //endregion
}
