package exercise_01.factory;

import exercise_01.enumeration.ShapeType;
import exercise_01.itf.Shape;
import exercise_01.rounded_shape.RoundedRectangle;
import exercise_01.rounded_shape.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeType st) {
        if (st == ShapeType.Rectangle)
            return new RoundedRectangle();
        return new RoundedSquare();
    }
}
