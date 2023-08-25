package exercise_01.run;

import exercise_01.enumeration.ShapeType;
import exercise_01.factory.RoundedShapeFactory;
import exercise_01.factory.ShapeFactory;
import exercise_01.itf.Shape;
import exercise_01.shape.Rectangle;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        System.out.println();

        ShapeFactory sf = new ShapeFactory();
        RoundedShapeFactory rsf = new RoundedShapeFactory();

        Shape rectangle = sf.getShape(ShapeType.Rectangle);
        Shape roundedSquare =rsf.getShape(ShapeType.Square);

        rectangle.draw();
        roundedSquare.draw();
    }
}
