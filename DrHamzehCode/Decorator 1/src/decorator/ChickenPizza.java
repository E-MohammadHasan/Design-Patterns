
package decorator;


public class ChickenPizza extends PizzaDecorator{
    private IPizza pizza;

    public ChickenPizza(IPizza pizza) {
        super(pizza);
    }

    
    @Override
    public String getDesc() {
        return pizza.getDesc() + " Add Chicken";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 1;
    }
    
}
