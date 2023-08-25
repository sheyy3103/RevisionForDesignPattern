package exercise_01.shape;

import exercise_01.itf.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square...");
    }
}
