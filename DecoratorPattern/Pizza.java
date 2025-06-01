
package DecoratorPattern;


public class Pizza implements IPizza{
    
    @Override 
    public String getDescription(){
        return "Original Pizza";
    }
    
    @Override 
    public double getPrice(){
        return 3.0;
    }
}
