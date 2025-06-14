
package builder.example;

public class Director {
    public Car getCamry(){
        var builder = new Car.CarBuilder()
                .setId(333)
                .setColor("Red")
                .setModel("Camry")
                .setYear(2025)
                .setSeats(5);
        var car = builder.build();
        return car;
    }
    
    public Car getHondaCivic(){
        var builder = new Car.CarBuilder()
                .setId(566)
                .setColor("Black")
                .setModel("Civic")
                .setYear(2025)
                .setSeats(5);
        var car = builder.build();
        return car;
    }
    
}
