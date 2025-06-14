
package decorator;


public class OlivePizza implements IPizza{
    private IPizza pizza;
    public OlivePizza(IPizza pizza){
        this.pizza = pizza ;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc() + " Add Olives";
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 0.5;
    }
}
