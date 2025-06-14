
package adapter;


public class FacebookAdapter extends FacebookLoginService implements ILoginService {

    @Override
    public void Login(String username) {
        UserLogin(username);
        
    }
    
}
