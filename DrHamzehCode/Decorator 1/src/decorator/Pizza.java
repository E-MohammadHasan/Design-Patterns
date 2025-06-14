
package decorator;


public class Pizza implements IPizza{

    @Override
    public String getDesc() {
        return "Original Pizza";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
    
}
