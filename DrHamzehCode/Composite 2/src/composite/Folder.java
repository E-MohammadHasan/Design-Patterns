
package composite;

import java.util.ArrayList;
import java.util.List;


public class Folder implements File {
    public List<File> files = new ArrayList<File>();
    @Override
    public void Delete(){
        for(var file : files){
            file.Delete();
        }
        System.out.println("Deleing folder");
    }
    
    public void addDocument(File doc){
        files.add(doc);
    }
}
