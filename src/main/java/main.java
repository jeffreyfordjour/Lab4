
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the car's year model:");
        int yearModel = keyboard.nextInt();
        
        System.out.println("What is the car's make:");
        String make = keyboard.next();
        
        Car c = new Car(yearModel,make);
        
         c.accelerate();
         System.out.println(c.getSpeed());
                 
         c.accelerate();
         System.out.println(c.getSpeed());
         
         c.accelerate();
         System.out.println(c.getSpeed());
        
         c.accelerate();
         System.out.println(c.getSpeed());
        
         c.accelerate();
         System.out.println(c.getSpeed());
         
         c.brake();
         System.out.println(c.getSpeed());
         
         c.brake();
         System.out.println(c.getSpeed());
         
         c.brake();
         System.out.println(c.getSpeed());
         
         c.brake();
         System.out.println(c.getSpeed());
         
         c.brake();
         System.out.println(c.getSpeed());
         
         
         
         
    }
        
    
    }
        
    }

