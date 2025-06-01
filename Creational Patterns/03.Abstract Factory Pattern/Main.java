package AbstractFactoryPattern;

public class Main {

    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    Shape shape1 = shapeFactory.getShape("Rectangle");

    shape1.draw ();

    Shape shape2 = shapeFactory.getShape("Square");

    shape2.draw ();
    
//**************************************************
    AbstractFactory shapeFactory_rounded = FactoryProducer.getFactory(true);
    Shape shape3 = shapeFactory.getShape("Rectangle");

    shape3.draw ();

    Shape shape4 = shapeFactory.getShape("Square");

    shape4.draw ();
}
