
package singleton;


public class LogFileManager {
    private static final LogFileManager instance;
    static {
        try{
            instance = new LogFileManager();
        }catch(Exception ex){
            
        }
    }
    private LogFileManager(){
        
    }
    public static LogFileManager getInstance(){
        return instance;
    }
            
    
    
}
