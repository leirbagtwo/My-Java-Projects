package MP6;
import java.util.Scanner;
/**
  @author Gabriel
 */
public class MP4 {
   public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> magicSquare = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("please enter an odd number: ");
            return;
        }

        // fill each element of array by 0
        for (int i=0; i<n; i++){
            magicSquare.add(new ArrayList<>());
            for (int j=0; j<n; j++){
                magicSquare.get(i).add(0);
            }
        }

        // fill magic square
        fillMagicSquare(magicSquare);

        // print magic square
        printMagicSquare(magicSquare);
    }
}
