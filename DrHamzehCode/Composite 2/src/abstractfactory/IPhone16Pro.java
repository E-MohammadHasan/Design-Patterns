
package abstractfactory;


public class IPhone16Pro implements Phone {

    @Override
    public String model() {
        return "IPhone 16 Pro";
    }

    @Override
    public void assemble() {
        System.out.println("IPhone 16 pro assembled");
    }
    
}
