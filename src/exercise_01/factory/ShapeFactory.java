package exercise_01.factory;

import exercise_01.enumeration.ShapeType;
import exercise_01.itf.Shape;
import exercise_01.shape.Rectangle;
import exercise_01.shape.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(ShapeType st) {
        if (st == ShapeType.Rectangle)
            return new Rectangle();
        return new Square();
    }
}
