package AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new RoundedSquare();
        }
        return null;
    }
}
