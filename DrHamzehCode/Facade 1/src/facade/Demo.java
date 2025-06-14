
package facade;


public class Demo {
    public static void main(String[] args){
        var reg = new StudentRegistrationFacade();
        reg.registerStudent("Jalal Ali");
        reg.registerStudent("Sameer Ahmad");
    }
}
