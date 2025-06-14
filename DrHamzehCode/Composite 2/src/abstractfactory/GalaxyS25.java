
package abstractfactory;


public class GalaxyS25 implements Phone {

    @Override
    public String model() {
        return "Galaxy S25";
    }

    @Override
    public void assemble() {
        System.out.println("Galaxy S25 Assembled");
    }
    
}
