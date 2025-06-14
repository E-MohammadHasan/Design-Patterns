
package abstractfactory;


public class AppleFactory implements ElectronicsFactory {

    @Override
    public Phone createPhone() {
        return new IPhone16Pro();
    }

    @Override
    public Tablet createTablet() {
        return new IPad11Pro();
        
    }
    
}
