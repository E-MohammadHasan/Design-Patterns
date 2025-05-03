package FactoryPattern;


public class Car extends Vehicle {
    int Wheel;
    
    Car(int Wheel){
        this.Wheel = Wheel;
    }
    
    @Override 
    public int getWheel(){
        return this.Wheel;
    }
}

