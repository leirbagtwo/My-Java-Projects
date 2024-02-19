package experiment3a;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * @author Gabriel
 */
public class MP3A {
     public static void main(String[] args){
       
       Random random = new Random();
       
       String userStringInput;
       double userAmountEntered;
       int wordIndex;
       String outputString ="",word="";
       String word1="",word2="",word3="";
       char playAgain = 'y';
       double TamountEntered = 0;
       double TamountWonsofar = 0;
       
       while(playAgain =='y'){
           outputString="";
           userStringInput = JOptionPane.showInputDialog("Insert Money: $");
           userAmountEntered = Double.parseDouble( userStringInput);
           TamountEntered += userAmountEntered;
           
       for (int wordCount =1; wordCount<=3; wordCount++){
            wordIndex = random.nextInt(6);
       
                if( wordIndex == 0){
                    word=("Cherries");
                }else if( wordIndex == 1){
                    word=("Oranges");
                }else if( wordIndex == 2){
                    word=("Plums");
                }else if( wordIndex == 3){
                    word=("Bells");
                }else if( wordIndex == 4){
                    word=("Melons");
                }else if (wordIndex == 5){
                    word=("Bars");
                }
       
                if(wordCount == 1){
                    word1 = word;
                } else if(wordCount == 2){
                    word2 = word;
                }else if(wordCount == 3){
                    word3 = word;
                }
                }
       outputString = outputString +"["+word1+"]["+word2+"]["+word3+"]";
       
       if ((word1 != word2) && (word1 !=word3) && (word2 != word3)){
           outputString = outputString +"You won $0";
           TamountWonsofar = TamountWonsofar +0;
       }else if(((word1 == word2) && (word1 !=word3)) || ((word1 == word3) && (word1 !=word2))||
                ((word2 == word3) && (word2 != word1))){
           outputString = outputString + String.format("\t\t\tx2\n\nYou won $%,.2f",(userAmountEntered*2));
           TamountWonsofar = TamountWonsofar + (userAmountEntered*2);
       }else{
           outputString = outputString + String.format("\t\t\tx3\n\nYou won $%,.2f",(userAmountEntered*3));
           TamountWonsofar = TamountWonsofar + (userAmountEntered*3);
       }
       outputString = outputString + String.format("\n\nAmount you've inserted so fa:$%,.2f\nAmount won so far: $%,.2f",TamountEntered, TamountWonsofar);
     
       playAgain = JOptionPane.showInputDialog(outputString+"\n\nDo you want to play"+"again? y / n: ").charAt(0);
       } 
       
       if(TamountEntered > TamountWonsofar){
           JOptionPane.showMessageDialog(null,String.format("You Inserted $%,.2f and won $%,.2f making a loss of $%,.2f. "+"Thanks for playing",
                   TamountEntered,TamountWonsofar, TamountWonsofar-TamountEntered));
       }else if (TamountEntered > TamountWonsofar){
           JOptionPane.showMessageDialog(null,String.format("You Inserted $%,.2f and won $%,.2f making a loss of $%,.2f. "+"Thanks for playing",
                   TamountEntered,TamountWonsofar, TamountWonsofar-TamountEntered));
      }else if (TamountEntered > TamountWonsofar){
           JOptionPane.showMessageDialog(null,String.format("You Inserted $%,.2f and won $%,.2f. You didn't make profit "+"or lost. Thanks for playing",
                   TamountEntered,TamountWonsofar));
      }
     }
}
    






       

         