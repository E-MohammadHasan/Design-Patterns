/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author MAXHUB
 */
public class Square extends Shape{
    private Color color;
    public Square(Color color) {
        super(color);
        this.color = color;
    }
    @Override
    public void draw(){
        System.out.println("Drawing Square " + color.getColor());
    }
}
