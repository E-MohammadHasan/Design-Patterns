package abstractfactory;

public class GalaxyTabS9 implements Tablet {

    @Override
    public String model() {
        return "Galaxy Tab S9";
    }

    @Override
    public void assemble() {
        System.out.println("Galaxy Tab s9 assembled");
    }

}
