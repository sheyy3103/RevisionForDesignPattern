package exercise_02.shape;

import exercise_02.itf.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}
