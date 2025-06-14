
package adapter;


public class LMS implements ILoginService{

    @Override
    public void Login(String username) {
        System.out.println("Login to LMS");
    }
    
}
