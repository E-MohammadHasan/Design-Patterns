
package bridgeexample;


public abstract class Message {
    protected MessageSender sender;
    
    //constructor
    public Message(MessageSender pSender){
        this.sender = pSender;
    }
    
    public abstract void send(String subject, String body);
}
