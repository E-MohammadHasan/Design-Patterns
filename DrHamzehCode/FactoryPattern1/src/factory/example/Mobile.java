package factory.example;


public class Mobile {
    public void StartACall(){
        CallOperations operation = getOperation();
        operation.makeCall();
    }
    
    protected CallOperations getOperation(){
        CallOperations operations = new VoiceCall();
        return operations;
    }
}
