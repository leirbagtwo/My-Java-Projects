/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Machineproblem2;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class Machineproblem2E {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double kg,distance;
    double rate,meter ,charge;
    
    System.out.print("Enter the Kilograms of the Package");
    kg = keyboard.nextInt();
     
    System.out.print("Enter the Distance of the Package");
    distance = keyboard.nextInt();
    
    if (kg<=1){
        rate=139.99;
        charge = ((kg/500)*rate);
    }
    else if(kg <=3){
        rate=359.99;
    }
    else if (kg <=5){
        rate=579.99;
    }
    else if (kg <=10){
        rate=799.99;
    }
    else if (kg <20){
        rate=1391.99;
    }
    else {
        System.out.println("error");
    }
    }
}
