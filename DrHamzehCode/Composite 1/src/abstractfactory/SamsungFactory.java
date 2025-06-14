
package abstractfactory;


public class SamsungFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new GalaxyS25();
    }

    @Override
    public Tablet createTablet() {
        return new GalaxyTabS9();
        
    }
}
