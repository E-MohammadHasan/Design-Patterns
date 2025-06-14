
package composite;

import java.util.ArrayList;
import java.util.List;


public class Folder {
    public List documents = new ArrayList();
    public void Delete(){
        for(var doc : documents){
            if(doc instanceof Document){
                ((Document) doc).Delete();
            }else if (doc instanceof Folder){
                ((Folder) doc).Delete();
                System.out.println("Delete folder");
            }
        }
    }
    
    public void addDocument(Object doc){
        documents.add(doc);
    }
}
