/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeexample;

/**
 *
 * @author MAXHUB
 */
public class UrgentMessage extends Message {

    public UrgentMessage(MessageSender pSender) {
        super(pSender);
    }

    @Override
    public void send(String subject, String body) {
        sender.sendMessage(subject, body);
        System.out.println("Send urgent message");
    }
    
}
