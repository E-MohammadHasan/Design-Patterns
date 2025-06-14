/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author MAXHUB
 */
public abstract class DisplayService {
    public void Display(){
        XMLParser parser = getParser();
        System.out.println(parser.parse());
    }
    
    public abstract XMLParser getParser();
    
}
