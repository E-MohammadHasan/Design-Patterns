package CompositePattern.composite2;


public class Document implements File {
    
    
    @Override 
    public void Delete(){
        System.out.println("Deleting Document...");
    }
}
