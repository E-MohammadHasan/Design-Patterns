
package factory.example;


public class VoiceCall implements CallOperations {

    @Override
    public void makeCall() {
        System.out.println("Voice call");
    }
    
}
