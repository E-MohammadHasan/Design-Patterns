
package factory.example;


public class MobileFactory {
    public static void main(String[] args){
        Mobile mobile = new IPhoneMobile();
        mobile.StartACall();
        
        mobile = new SamsungMobile();
        mobile.StartACall();
    }
}
