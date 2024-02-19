package prelimexam;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
/**x
 * @author Gabriel
 */
public class PrelimExam {
    public static void main(String[] args) throws IOException{
     Random random = new Random();
     Scanner keyboard = new Scanner (System.in);
     int Computer,Me;
     int Comscore = 0;
     int Mescore = 0;
     int loop;
     String fileName ="DiceGameLog.txt";
        try (PrintWriter outputFile = new PrintWriter(fileName)) {
            System.out.print("Enter times you want to roll a dice: ");
            loop = keyboard.nextInt();
            outputFile.println("Enter times you want to roll a dice: "+loop);
            
            for (int turn = 1; turn<=loop; turn++) {
                Computer = random.nextInt(6)+1;
                Me = random.nextInt(6)+1;
                
                if(Computer > Me ){
                    Comscore = Comscore + 1;
                    System.out.println("Roll "+turn+" Computer won ");
                    outputFile.println("Roll "+turn+" Computer won");
                }else if (Me > Computer){
                    Mescore = Mescore + 1;
                    System.out.println("Roll "+turn+" User won ");
                    outputFile.println("Roll "+turn+" User won");
                }else {
                    System.out.println("Roll "+turn+" Draw");
                    outputFile.println("Roll "+turn+" Draw");
                }
            }
            System.out.println();
            
            if ( Comscore > Mescore){
                System.out.println("Computer was the winner "+Comscore+ " / "+loop+" turns");
                outputFile.println("Computer was the winner "+Comscore+ " / "+loop+" turns");
            }else if ( Mescore > Comscore){
                System.out.println("User win in the dice game "+Mescore+ " / "+loop+" turns");
                outputFile.println("User win in the dice game "+Mescore+ " / "+loop+" turns");
            }else if (Comscore == Mescore){
                System.out.println("The die game was a draw the score is "+Comscore+" out of "+Mescore );
                outputFile.println("The die game was a draw the score is "+Comscore+" out of "+Mescore);
            }  }
      System.out.println("\nGame Data has been stored to DiceGamelog");
      
  } 
}
