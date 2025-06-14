
package singleton;

import java.util.ArrayList;
import java.util.List;


public class RegsitrationManager {
    private List<String> names = new ArrayList<String>();
    
    //Eager: create object once we create the class
    //private static RegsitrationManager instance = new RegsitrationManager();
    
    //Lazy: create object when we use it for the first time
    private static RegsitrationManager instance;
    private RegsitrationManager(){
        
        System.out.println("Here we have a new object of RegManager");
    }
    public static RegsitrationManager getInstance(){
        //lazy:
        if(instance == null)
            instance = new RegsitrationManager();
        return instance;
    }
    
    public void AddStudent(String name){
        names.add(name);
    }
    public void PrintStudentList(){
        for(int i=0; i<names.size(); i++){
            System.out.println(i+": "+ names.get(i));
        }
    }
}
