
package bridgeexample;


public class NormalMessage extends Message{

    public NormalMessage(MessageSender pSender) {
        super(pSender);
    }

    @Override
    public void send(String subject, String body) {
        sender.sendMessage(subject, body);
        System.out.println("Send normal message");
    }
    
}
