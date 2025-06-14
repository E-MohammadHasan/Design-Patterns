
package composite;
import java.util.ArrayList;

public class Demo {
 
    public static void main(String [] args){

        testFiles();
    }
    
    public static void testFiles(){
        var list = new ArrayList();
        var images = new Folder();
        var data = new Folder();
        var recentImages = new Folder();
        var names = new Document();
        var sc1 = new Document();
        var sc2 = new Document();
        
        data.addDocument(sc2);
        data.addDocument(sc1);
        data.addDocument(images);
        images.addDocument(names);
        images.addDocument(recentImages);
        
        data.Delete();
        
        
        
        //list.add(list)
    }
}
