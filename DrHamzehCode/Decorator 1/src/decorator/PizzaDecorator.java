
package decorator;


public abstract class PizzaDecorator implements IPizza{
    private IPizza pizza;
    public PizzaDecorator(IPizza pizza){
        this.pizza = pizza ;
    }
    
}
