
package bridge;


public class Green extends Color{
    public void fill(){
        System.out.println("Fill green color");
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
