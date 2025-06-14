
package bridge;


public class BridgeDemo {
    public static void main(String[] args){
        var circle = new Circle(new Red());
        circle.draw();
        
        var square = new Square(new Green());
        square.draw();
    }
}
