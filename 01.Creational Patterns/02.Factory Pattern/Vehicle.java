package FactoryPattern;

public abstract class Vehicle {
    
    public abstract int getWheel();
    
    
    public String toString(){
        return "Good job .... Wheel : " + this.getWheel();
    }
}
