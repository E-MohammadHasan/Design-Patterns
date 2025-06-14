
package bridge;


public class Red extends Color {
   @Override
   public void fill(){
        System.out.println("Fill red color");
    } 

    @Override
    public String getColor() {
        return "Red";
    }
}
