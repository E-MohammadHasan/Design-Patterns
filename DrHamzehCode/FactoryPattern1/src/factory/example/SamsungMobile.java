
package factory.example;


public class SamsungMobile extends Mobile {
    @Override
    protected CallOperations getOperation(){
        CallOperations operations = new VoiceCall();
        return operations;
    }
}
