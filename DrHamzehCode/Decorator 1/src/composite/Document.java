
package composite;


public class Document implements File {
    @Override
    public void Delete(){
        System.out.println("Deleting document");
    }
}
