/*
 */
package Machineproblem2;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class Machineproblem2B {
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double  weight, height;
        double  BMI;
        System.out.print("Enter your weight in pounds: ");
        weight = keyboard.nextInt();
        System.out.print("Enter your height in inches: ");
        height = keyboard.nextInt();
        
        BMI = weight * 703 / height;
     
        if(BMI >=18.5 && BMI <=25){
            System.out.println("Your BMI is optimal weight ");
        }
        else if (BMI >=0 && BMI <=18.5){
            System.out.println("Your BMI is considered underweight ");
        }
        else {
            System.out.println("Your BMI is considered overweight ");
        }
        
        
      }
    }
