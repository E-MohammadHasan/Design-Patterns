
package abstractfactory;

public class IPad11Pro implements Tablet {

    @Override
    public String model() {
        return "IPad 11 Pro";
    }

    @Override
    public void assemble() {
        System.out.println("IPad 11 Pro assembled");
    }
    
}
