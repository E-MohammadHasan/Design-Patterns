
package adapter;

//Useing Composition
public class GoogleAdapter implements ILoginService{
    private GoogleLoginService service;
    public GoogleAdapter(){
        service = new GoogleLoginService();
    }

    @Override
    public void Login(String username) {
        service.SignIn(username);
    }
}
