package MP6;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class MP2 {
     public static void main(String[] args) {
      System.out.println("   LTO Driver's License Exam "); 
      Scanner input = new Scanner(System.in); 
      System.out.println(" 20 Multiple-Choice Questions "); 
      System.out.println("       A, B, C, D   "); 
      String[] answers = new String[20]; 
      String answer; 
      for (int i = 0; i < 20; i++){
         do
         {
            System.out.print((i+1) + ": "); 
            answer = input.nextLine(); 
         } while (!isValidAnswer(answer)); 
            answers[i] = answer; 
      }
      LTOEXAM exam = new LTOEXAM(answers); 
      System.out.println("  RESULTS  "); 
      System.out.println("Total Correct: " + exam.totalCorrect()); 
      System.out.println("Total Incorrect: " + exam.totalIncorrect()); 
      String passed = exam.passed() ? "YES" : "NO"; 
      System.out.println("Passed: " + passed); 
      if (exam.totalIncorrect() > 0){
          System.out.println("The incorrect answers are: "); 
          int missedIndex; 
          for (int i = 0; i < exam.totalIncorrect(); i++){
            missedIndex = exam.questionsMissed()[i]+1; 
            System.out.print(" " + missedIndex); 
            System.out.println();
          }
      }
   } 
   public static boolean isValidAnswer (String answer){
      return "A".equalsIgnoreCase(answer) || 
         "B".equalsIgnoreCase(answer)
         || "C".equalsIgnoreCase(answer) || 
         "D".equalsIgnoreCase(answer); 
   }
} 
