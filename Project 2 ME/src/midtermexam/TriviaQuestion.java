package midtermexam;
/**
 * @author Gabriel
 */
public class TriviaQuestion {
    public String question, answer;
    public int value;

    TriviaQuestion(String question, String answer, int value) { 
        this.question = question; 
        this.answer = answer;
        this.value = value;
    }
    public String getQuestion() {                           
        return this.question;
    } 

    public String getAnswer() {                              
        return this.answer;
    } 

    public int getValue() {          
        return this.value;
    } 
}