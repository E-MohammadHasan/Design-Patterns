
package abstractfactory;


public class AbstractFactoryDemo {
    private static void Test(ElectronicsFactory factory){
        var phone = factory.createPhone();
        phone.assemble();
        System.out.println("Model: "+ phone.model());
    
        var tab = factory.createTablet();
        tab.assemble();
        }
    
    public static void main(String[] args){
        Test(new SamsungFactory());
    }
}
