package com.company.rectangle;

public class Rectangle {

    //region Properties
    private int height;
    private int width;
    //endregion

    //region Constructors
    Rectangle() {
    }

    Rectangle(int height, int width) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Enter valid height.");
        }

        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Enter valid width.");
        }
    }
    //endregion

    //region Public Methods
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public double calculateArea() {
        return height * width;
    }
    //endregion

    //region Getters and Setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Enter valid height.");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Enter valid width.");
        }
    }
    //endregion
}
