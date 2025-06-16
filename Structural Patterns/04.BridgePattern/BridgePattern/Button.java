package BridgePattern;

public class Button implements CommonUI {

    private OperatingSystem operatingSystem;

    public Button(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void click() {
        this.operatingSystem.doOperation();
    }
}
