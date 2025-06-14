
package decorator;


public class DecoratorDemo {
    public static void main(String[] args){
        var pizza = new Pizza();
        System.out.println("Price:" + pizza.getPrice());
        
        var olivePizza = new OlivePizza(pizza);
        System.out.println("Price:"+olivePizza.getPrice()); 
    
        var chickenPizza = new ChickenPizza(olivePizza);
        System.out.println("Price:" + chickenPizza.getPrice());
        System.out.println("Desc:" + chickenPizza.getDesc());
    }
}
