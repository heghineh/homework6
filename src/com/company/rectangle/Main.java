package com.company.rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 4);
        Rectangle anotherRectangle = new Rectangle();

        System.out.println("Width: " + rectangle.getHeight() + "   |  Height: " + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        System.out.println("\nAnother rectangle:");
        anotherRectangle.setHeight(3);
        anotherRectangle.setWidth(5);

        System.out.println("Width: " + anotherRectangle.getHeight() + "   |  Height: " + anotherRectangle.getWidth());
        System.out.println("Perimeter: " + anotherRectangle.calculatePerimeter());
        System.out.println("Area: " + anotherRectangle.calculateArea());
    }
}