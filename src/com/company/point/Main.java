package com.company.point;

public class Main {
    public static void main(String[] args) {

        Point a = new Point(2, 5);
        Point b = new Point(6, 0);

        System.out.println("Distance of 1-st point from (0,0): " + a.distance());
        System.out.println("Distance of 2-nd point from (0,0): " + b.distance());
        System.out.println("Distance between 1-st and 2-nd points: " + a.distance(b));
    }
}