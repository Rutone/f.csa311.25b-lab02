package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

//Renderer класс аливаа Shape объект хүлээн авч, талбайг нь тооцоолох үүрэгтэй.

public class Renderer {
    private final Shape shape;

    //Конструктор нь Shape объект хүлээн авна.
    public Renderer(Shape shape) {
        this.shape = shape;
    }
    public void draw() {
        double area = shape.getArea();
        System.out.println("""
                           Shape printed
                           Its area is """ + area);
    }
}
