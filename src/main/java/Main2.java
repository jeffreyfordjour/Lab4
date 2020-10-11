
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
public class Main2 {
    public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the radius:");
        double radius = keyboard.nextDouble();
        
         Circle c = new Circle(radius);
         
         
         System.out.println("The area is "+c.area());
         System.out.println("The diameter is "+c.diameter());
         System.out.println("The circumference is "+c.circumference());
    }
}
