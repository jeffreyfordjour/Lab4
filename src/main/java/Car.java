/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class Car {
    private int yearModel;
    private String make;
    private double speed;
    
    Car(int newYearModel, String newMake) {
        
    yearModel = newYearModel;
    make = newMake;
    speed = 0;
    }
    
    
    
    
    public int getYearModel() {
    return yearModel;
    }
    public void setYearModel(int newYearModel){
    yearModel = newYearModel;
    }
    
    
    public String getMake(){
    return make;
    }
    public void setGetMake(String newMake){
    make = newMake;
    }
    
    public double getSpeed() {
    return speed;
    }
    public void setGetSpeed(double newSpeed){
    speed = newSpeed;
    }
    
    public void accelerate() {
    speed = speed + 5;
    }
    
      public void brake() {
    speed = speed - 5;
    }
    
    

          
    
}
