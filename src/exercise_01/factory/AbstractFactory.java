package exercise_01.factory;

import exercise_01.enumeration.ShapeType;
import exercise_01.itf.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType st);
}
