package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    // 🔹 Mark fields as final to prevent modification after initialization
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}
