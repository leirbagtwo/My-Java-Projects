/*
 */
package Machineproblem2;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class MachineproblemExample {
 public static void main(String[] args)
 {
    Scanner keyboard = new Scanner(System.in);
     
    double weight, distance;
    double charge, tdistance;

    System.out.print("Enter the Kilograms of the Package: ");
    weight = keyboard.nextDouble();
    
    System.out.print("Enter the Distance of the Package: ");
    distance = keyboard.nextDouble();
    
    if(weight<=1){
            if(distance%500==0){
            charge = ((distance/500)*139.99);
            System.out.println("The total rate charge is: P" + charge);
    }
            else if(distance%500!=0){
            tdistance = distance%500;
            distance = distance-tdistance;
            charge = ((distance/500)*139.99)*2;
            System.out.println("The total rate charge is: P" + charge);
    }
    }
    else if(weight<=3){
            if(distance%500==0){
            charge = ((distance/500)*359.99);
            System.out.println("The total rate charge is: P" + charge);
    }
            else if(distance%500!=0){
            tdistance = distance%500;
            distance = distance-tdistance;
            charge = ((distance/500)*359.99)*2;
            System.out.println("The total rate charge is: P" + charge);
    }
    }
    else if(weight<=5){
            if(distance%500==0){
            charge = ((distance/500)*579.99);
            System.out.println("The total rate charge is: P" + charge);
    }
            else if(distance%500!=0){
            tdistance = distance%500;
            distance = distance-tdistance;
            charge = ((distance/500)*579.99)*2;
            System.out.println("The total rate charge is: P" + charge);
    }
    }
    else if(weight<=10){
            if(distance%500==0){
            charge = ((distance/500)*799.99);
            System.out.println("The total rate charge is: P" + charge);
    }
            else if(distance%500!=0){
            tdistance = distance%500;
            distance = distance-tdistance;
            charge = ((distance/500)*799.99)*2;
            System.out.println("The total rate charge is: P" + charge);
    }
    }
    else if(weight<=20){
            if(distance%500==0){
            charge = ((distance/500)*1319.99);
            System.out.println("The total rate charge is: P" + charge);
    }
            else if(distance%500!=0){
            tdistance = distance%500;
            distance = distance-tdistance;
            charge = ((distance/500)*1319.99)*2;
            System.out.println("The total rate charge is: P" + charge);
    }
    }
    else{
            System.out.println("ERROR");
        }
    }
}