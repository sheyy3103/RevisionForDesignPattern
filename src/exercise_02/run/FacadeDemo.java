package exercise_02.run;

import exercise_02.enity.ShapeMaker;

public class FacadeDemo {
    public static void main(String[] args) {

        System.out.println();

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
