
package bridgeexample;


public class SMSSender implements MessageSender {
     @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Send SMS message");
    }
}
