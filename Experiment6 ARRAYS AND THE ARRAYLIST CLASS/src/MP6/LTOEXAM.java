package MP6;
/**
 @author Gabriel
 */
public class LTOEXAM {
      private final String[] correctAnswers = 
         {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", 
         "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};                               
      private final String[] userAnswers; 
        int[] missed = new int[correctAnswers.length]; 
      public LTOEXAM (String[] Answers){
        userAnswers = new String[Answers.length]; 
        System.arraycopy(Answers, 0, userAnswers, 0, Answers.length);
      }
      public boolean passed(){
         return totalCorrect() >= 15; 
      }
      public int totalCorrect() {
         int correctCount = 0; 
         for (int i = 0; i < correctAnswers.length; i++){
         if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
            correctCount++; 
            }
          }
          return correctCount; 
       }  
       public int totalIncorrect(){
         int incorrectCount = 0; 
         for (int i = 0; i < correctAnswers.length; i++){
         if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i])){
            missed[incorrectCount] = i; 
            incorrectCount++; 
         }
      }
      return incorrectCount; 
       }
       public int[] questionsMissed(){
          return missed; 
    }
}
