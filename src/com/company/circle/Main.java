package com.company.circle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Circle anotherCircle = new Circle();

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\nAnother circle:");
        anotherCircle.setRadius(2);

        System.out.println("Radius: " + anotherCircle.getRadius());
        System.out.println("Perimeter: " + anotherCircle.calculatePerimeter());
        System.out.println("Area: " + anotherCircle.calculateArea());
    }
}