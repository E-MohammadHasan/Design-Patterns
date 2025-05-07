package FactoryPattern;

public class Main {

    public static void main(String[] args) {
        
       VehicleFactory carFactory = new CarFactory();
       Vehicle car = carFactory.createVehicle();
       
        System.out.println(car);

//        Vehicle car = VehicleFactory.getInstance("Car", 4);
//        System.out.println(car);
//        
//        Vehicle bike = VehicleFactory.getInstance("Bike", 2);
//        System.out.println(bike);
    }
}
