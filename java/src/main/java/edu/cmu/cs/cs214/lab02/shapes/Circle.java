package edu.cmu.cs.cs214.lab02.shapes;

//private болон final болгож гаднаас өөрчлөх боломжгүй болголоо
public class Circle implements Shape {
    private final double radius; 

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
