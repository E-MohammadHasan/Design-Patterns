
package bridge;


public class Circle extends Shape {
    private Color color;
    public Circle(Color color) {
        super(color);
        this.color = color;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing Circle " + color.getColor());
    }
}
