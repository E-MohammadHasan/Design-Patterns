package FactoryPattern;


public class Bike extends Vehicle{
    int Wheel ;
    
    public Bike(int Wheel){
        this.Wheel = Wheel;
    }
    
    @Override
    public int getWheel(){
        return this.Wheel;
    }
}
