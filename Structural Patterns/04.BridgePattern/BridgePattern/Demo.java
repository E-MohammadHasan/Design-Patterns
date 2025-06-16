package BridgePattern;

public class Demo {

    public static void main(String[] args) {

        var os = new Windows();
        var button = new Button(os);
        
        button.click();
        
        
        // Same button used , ui and os can be developed independently ...
        button.setOperatingSystem(new Linux());
        button.click();
        
        
    }

}
