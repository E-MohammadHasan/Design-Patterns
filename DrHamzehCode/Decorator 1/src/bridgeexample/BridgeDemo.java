
package bridgeexample;


public class BridgeDemo {
    public static void main(String[] args){
        MessageSender sender = new SMSSender();
        Message msg = new NormalMessage(sender);
        msg.send("Hello", "Hi, how're you?");
        
        Message msg2 = new UrgentMessage(sender);
        msg2.send("Urgent msg", "Hello, print out this document");
    }
}
