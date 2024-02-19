package MidtermEx;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.io.IOException;
/*
 * @author Gabriel
 */
public class TriviaGame {
    public static void main(String[] args) throws IOException {
         int playerturn=0;
        ArrayList<Object> qArray = new ArrayList<>();
        Question question = new Question();
        qArray = Question.createquestion("questions.txt");
         
        for (Object q : qArray)

        {

             
        }

        
    }
}
