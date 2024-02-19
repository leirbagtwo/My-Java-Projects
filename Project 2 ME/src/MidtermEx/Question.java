package MidtermEx;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Question {
    private static int NumberofQuest = 10;
    private String[] question = new String[NumberofQuest] ;
    private static int NumofAns=0;
    private String[] possibleAns = new String[NumofAns];
    private int[] correctAns = new int[NumberofQuest];

    public Question(){
        question= null;
        for (int i=0; i<= NumofAns; i++){
        setPossibleAns("");
        }
         correctAns=null;
    }
    public static ArrayList<Object> createquestion
        (String filename) throws IOException{
            
       Question qArray[] = null;
       File file = new File(filename);
       Scanner line = new Scanner(file);
       ArrayList<Object> qObject = new ArrayList<>();

      while (line.hasNext()){
       for (int i=0; i<= NumberofQuest; i++){
           qArray[i] = new Question();
           qArray[i].setQuestion(line.nextLine());
           qArray[i].setNumofAns(Integer.parseInt(line.nextLine()));
           for (int j=0; j<= NumofAns; j++){
               qArray[i].setPossibleAns(line.nextLine());
           }
           qArray[i].setNumofAns(Integer.parseInt(line.nextLine()));
           qObject.add(qArray[i]);
          }
        }
        return qObject;
      }
    public void setQuestion(String quest){
       question[NumberofQuest]= quest;
     }
    public String[] getQuestion(){
       return question;
      }
    public void setNumofAns(int num){
       NumofAns=num;
    }
    public int getNumofAns(){
       return NumofAns;
    }
    public void setPossibleAns(String ans){
       possibleAns[NumofAns]= ans;
    }
    public String[] getPossibleAns(){
       return possibleAns;
    }
    public void setCorrectAns(int correctNum){
       correctAns[NumberofQuest]= correctNum;
    }
    public int[] getCorrectAns(){
      return correctAns;
    }
    public static void displayQuestion(Question q, int playerTurn) throws IOException{
       System.out.println("Question for player #" + playerTurn);
       System.out.println(q.getQuestion());    
        for (int i=0; i <= NumofAns; i++){
          System.out.println(q.getPossibleAns());
       }
   }
}

