/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeexample;


public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Send email message");
    }
    
}
