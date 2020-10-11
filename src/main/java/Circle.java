/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class Circle {
    private double radius;
    private double PI = 3.14159;
    
    Circle(double newRadius) {
        
    radius = newRadius;
    }
    
    public double getRadius() {
    return radius;
    }
    public void setRadius(double newRadius){
    radius = newRadius;
    }
    Circle(){
    radius = 0;
    }
    public double area() {
    double area = PI * radius * radius;
    return area;
    }
   public double diameter() {
    double diameter = radius * 2;
    return diameter;
   }
   
   public double circumference() {
    double circumference = 2 * PI * radius;
    return circumference;
   }
    
}
