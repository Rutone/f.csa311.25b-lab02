package edu.cmu.cs.cs214.lab02.shapes;

// private болон final болгож гаднаас өөрчлөх боломж хамгаалаа
public class Square implements Shape {
    private final double sideLen; // уртыг final болгож хамгаалав

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getArea() {
        return sideLen * sideLen;
    }
}
