package FactoryPattern;

public abstract class VehicleFactory {
  
    public abstract Vehicle createVehicle();
    
    
//    public static Vehicle getInstance(String type , int Wheel){
//        if(type == "Car"){
//            return new Car(Wheel);
//        }
//        else if (type == "Bike"){
//            return new Bike(Wheel);
//        }
//        return null;
//    }


}
