package DecoratorPattern;

public class ChickenPizza extends PizzaDecorator {
    
    public ChickenPizza(IPizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescription() {
       return pizza.getDescription() + " Add Chicken";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 1;
    }
    
}
