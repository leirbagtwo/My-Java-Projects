package mp5;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class TestScoresMain {
 public static void main(String[] args) {
     double test1;
     double test2;
     double test3;
     try (Scanner scanner = new Scanner (System.in)) {
         System.out.print("Enter test score: ");
         test1 = scanner.nextDouble();
         
         System.out.print("Enter test score: ");
         test2 = scanner.nextDouble();
         
         System.out.print("Enter test score: ");
         test3 = scanner.nextDouble();
     }

    TestScores scores = new TestScores(test1, test2, test3);
    System.out.println("The average test score: "+ scores.getAverageScore());
    }
}
