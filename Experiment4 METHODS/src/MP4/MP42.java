package MP4;
import java.util.Random;
import java.util.Scanner;
/** @author Gabriel
 */
public class MP42 {
     public static String AIhand(Random random){
       int wordNum;
       wordNum = random.nextInt (3)+1;
       String AIChoice = "";
       
       if( wordNum == 1){
           AIChoice = "Rock";
       }else if ( wordNum == 2){
           AIChoice = "Paper";
       }else if ( wordNum == 3){
           AIChoice = "Scissors";
       }
        System.out.println("AI has made a choice");
        return AIChoice;
      }
     
     public static void Menu(){
         System.out.println("Rock Paper Scissors");
     }
     
     public static String UserHand(Scanner scanner){
         
         String UserChoice;
         System.out.print("Enter your Choice: ");
         UserChoice = scanner.nextLine();
         
         return UserChoice; 
     }
     
     public static String Winwin( String AIhand, String Userhand){
         String win ="Draw no one";
         String qoute ="";
         String finalqoute="";
        
         String Rockqoute ="The rock smashes the scissors";
         String Scisqoute ="Scissors cuts paper";
         String Paperqoute="Paper wraps rock";
         //rock//
         if( AIhand.equals("Rock")&& Userhand.equalsIgnoreCase("Scissors")){
               win ="Computer";
               qoute = Rockqoute;
         }else if( Userhand.equalsIgnoreCase("Rock")&&AIhand.equals("Scissors") ){
               win ="User";
               qoute = Rockqoute;
         }
         
         //scissors//
         else if( AIhand.equals("Scissors")&& Userhand.equalsIgnoreCase("Paper")){
               win ="Computer";
               qoute = Scisqoute;
         }else if( Userhand.equalsIgnoreCase("Scissors")&&AIhand.equals("Paper") ){
               win ="User";
               qoute = Scisqoute;
               
         //paper//
        }     else if( AIhand.equals("Paper")&& Userhand.equalsIgnoreCase("Rock")){
               win ="Computer";
               qoute = Paperqoute;
         }else if( Userhand.equalsIgnoreCase("Paper")&&AIhand.equals("Rock") ){
               win ="User";
               qoute = Paperqoute;
        }
         finalqoute = win +" wins ("+qoute+")";
         return finalqoute;
     }   
     
    public static void main (String [] args){
     
     Random random = new Random();
     Scanner scanner = new Scanner(System.in);
     String AIChoice;
     String userChoice ;
     String win ;
     
     Menu();
     AIChoice = AIhand (random);
     userChoice = UserHand (scanner);
     win = Winwin( AIChoice,userChoice );
     System.out.println("User pick: " + userChoice + "\nComputer pick: "+AIChoice);
     System.out.println(win);
     
     
     //draw play again//
     while(win.equals("Draw no one wins ()")){
          System.out.print("Draw play again ");
          Menu();
          userChoice = UserHand (scanner);
          AIChoice = AIhand (random);
          win = Winwin( AIChoice,userChoice );
          System.out.println("User pick: " + userChoice + "\nComputer pick: "+AIChoice);
          System.out.println(win);
      }
    }
}
