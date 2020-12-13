package com.company.triangle;

import com.company.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);
        Triangle anotherTriangle = new Triangle();

        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());

        System.out.println("\nAnother triangle:");
        anotherTriangle.setSideA(6);
        anotherTriangle.setSideB(7);
        anotherTriangle.setSideC(8);

        System.out.println("Perimeter: " + anotherTriangle.calculatePerimeter());
        System.out.println("Area: " + anotherTriangle.calculateArea());
    }
}