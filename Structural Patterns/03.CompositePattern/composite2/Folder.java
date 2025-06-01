package CompositePattern.composite2;

import java.util.List;
import java.util.ArrayList;

public class Folder implements File {  
    public List <File> files = new ArrayList<File>();
    @Override 
    public void Delete(){
        for(var file : files){
            file.Delete();
        }
        System.out.println("Deleting Folder .");
    }
    
    public void addDocument(File doc){
        files.add(doc);
    }
    
}