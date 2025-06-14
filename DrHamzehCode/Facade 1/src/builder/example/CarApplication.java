package builder.example;

public class CarApplication {

    public static void main(String[] args) {
        var director = new Director();
        CarInterface camry = director.getCamry();
        System.out.println("Camry Details:" + camry.toString());
        
        CarInterface civic = director.getHondaCivic();
    }
}
