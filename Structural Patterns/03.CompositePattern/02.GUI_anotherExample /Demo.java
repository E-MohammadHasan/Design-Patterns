package CompositePattern.gui;

public class Demo {

    public static void main(String[] args) {

        Container root = new Container();

        Button button1 = new Button();
        Button button2 = new Button();
        TextBox textBox = new TextBox();

        Container nestedContainer = new Container();

        nestedContainer.Add(button2);// one button inside nested

        root.Add(button1);
        root.Add(textBox);
        root.Add(nestedContainer); // nested container

        root.Draw(); // should draw everything

    } 
}
