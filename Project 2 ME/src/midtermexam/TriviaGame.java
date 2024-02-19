package midtermexam;
import java.util.*;
/**
 * @author Gabriel
 */
public class TriviaGame{
    public TriviaQuestion questions[];
    public int score, questionNum;
    
    TriviaGame(TriviaQuestion questions[]) {    
        this.questions = Arrays.copyOf(questions, questions.length); 
        this.score = 0;
        this.questionNum = 0;
    }
    public boolean askNextQuestion() {
        this.questionNum++;                       
        if(this.questionNum > questions.length)
        return false;
        Scanner input = new Scanner(System.in);

        String question = questions[questionNum-1].getQuestion();      
        String answer = questions[questionNum-1].getAnswer();       
        int value = questions[questionNum-1].getValue();

        System.out.println("\nQuestion " + questionNum);       
        System.out.print("For " + value + " point(s):     ");   
        System.out.println(question);

        String answer1 = input.nextLine();                      

        if(answer1.equalsIgnoreCase(answer)) {                 
            System.out.println("That is correct!");                
            this.score += value;
          }
        else
            System.out.println("Wrong. The correct answer is "
                    + "\"" +answer+"\""); 
                    
            showScore();                                                   
            return true;
        }
    public void showScore() {
        System.out.println(" Your score is " + this.score +" ");
     }
    public void restart() {                          
        this.score = 0;
        this.questionNum = 0;
    }
    public int getScore() {
        return this.score;
    }
}
