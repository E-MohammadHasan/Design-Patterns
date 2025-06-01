package DecoratorPattern;


public class OlivePizza implements IPizza{
    private IPizza pizza;
    
    public OlivePizza(IPizza pizza){
        this.pizza = pizza;
    }
    
    @Override 
    public String getDescription(){
        return pizza.getDescription() + " Add Olives";
    }
    
    @Override 
    public double getPrice(){
        return this.pizza.getPrice() + 0.5;
    }
}
