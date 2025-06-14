
package singleton;


public class DbManager {
    private static DbManager instance;
    private DbManager(){}
    public static synchronized DbManager getInstance(){
        if(instance == null){
            instance = new DbManager();
        }
        return instance;
    }
}
