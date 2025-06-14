
package adapter;


public class LMSLoginDemo {
    public static void Login(ILoginService service, String username){
        service.Login(username);
    }
    
    public static void main(String [] args){
        var lms = new LMS();
        Login(lms, "test");
        
        var googleAdapter = new GoogleAdapter();
        Login(googleAdapter, "test1");
        
        var fbAdapter = new FacebookAdapter();
        Login(fbAdapter, "test user");
    }
}
