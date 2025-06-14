
package factory.example;


public class IPhoneMobile extends Mobile {
    @Override
    protected CallOperations getOperation(){
        CallOperations operations = new VideoCAll();
        return operations;
    }
    
}
