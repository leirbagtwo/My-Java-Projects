package Machineproblem2;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class Machineproblem2C {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double test1,test2,test3;
        double average;
        
        System.out.print("Enter test score 1: ");
        test1 = keyboard.nextInt();       
        System.out.print("Enter test score 2: ");
        test2 = keyboard.nextInt();  
        System.out.print("Enter test score 3: ");
        test3 = keyboard.nextInt();  
        average = (test1+test2+test3)/3;
        
        if (average >=93 && average <=100){
           System.out.println("Your average is "+average+" and your grade is A");
        }
        else if (average >=90 && average <=92){
            System.out.println("Your average is "+average+" and your grade is A-");
        }
        else if (average >=87 && average <=89){
            System.out.println("Your average is "+average+" and your grade is B+");
        }
        else if (average >=83 && average <=86){
            System.out.println("Your average is "+average+" and your grade is B");
        }
        else if (average >=80 && average <=82){
            System.out.println("Your average is "+average+" and your grade is B-");
        }
        else if (average >=77 && average <=79){
            System.out.println("Your average is "+average+" and your grade is C+");
        }
        else if (average >=73 && average <=76){
            System.out.println("Your average is "+average+" and your grade is C");
        }
        else if (average >=70 && average <=72){
            System.out.println("Your average is "+average+" and your grade is C-");
        }
        else if (average >=67 && average <=69){
            System.out.println("Your average is "+average+" and your grade is D+");
        }
        else if (average >=63 && average <=66){
            System.out.println("Your average is "+average+" and your grade is D");
        }
        else if (average >=60 && average <=62){
            System.out.println("Your average is "+average+" and your grade is D-");
        }
        else{
            System.out.println("Your average is "+average+" and your grade is F");
        }
    }
}
