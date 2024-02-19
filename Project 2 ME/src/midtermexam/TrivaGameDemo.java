package midtermexam;
import java.util.*;
/**
 * @author Gabriel
 */
public class TrivaGameDemo {
   public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        playGame(input);
        } 
   public static void playGame(Scanner input) { 
        int numOfGames = 0, totalScore = 0;      
        double avgScore;                        
        TriviaGame game = new TriviaGame(populateQuestions());
        while(true) {                        
        numOfGames++;        
        while(game.askNextQuestion()){}
        totalScore += game.getScore();
        game.restart();
        System.out.println();
        System.out.println("GAME OVER! Would you like to play again? \n(Yes/No):");
        String choice = input.next();
        if(choice.equalsIgnoreCase("No") || !choice.equalsIgnoreCase("Yes")) 
        {
        break;
        } 
        }
        avgScore = (double) totalScore/numOfGames;                         
        System.out.println("You played " + numOfGames + 
                " game/(s) and your average score was " + avgScore
        + ". Thank you for playing, have a great day! ");                 
        }
        public static TriviaQuestion[] populateQuestions() {     
        System.out.println("Choices");   
    
        TriviaQuestion ob1 = new TriviaQuestion              
        ("Which city is known as the “Walled City?", "1", 2);
        
        TriviaQuestion ob2 = new TriviaQuestion
        ("Which country occupied the Philippines during World War II?","2",2);
        
        TriviaQuestion ob3 = new TriviaQuestion
        ("This Disney princess' sidekick was a chameleon", "3", 2);
  
        TriviaQuestion ob4 = new TriviaQuestion
        ("In the Disney movie Mulan, Mulan's undercover name was ______ ", "5", 3);
        
        TriviaQuestion ob5 = new TriviaQuestion
        ("This Disney princess relied on a gourd as her means of transport", "4", 1);
        return new TriviaQuestion[]{ob1, ob2, ob3, ob4, ob5};
        } 
} 
