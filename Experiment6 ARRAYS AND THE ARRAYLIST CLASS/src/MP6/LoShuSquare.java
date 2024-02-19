package MP6;
import java.util.ArrayList;
import java.util.Scanner;
/**
  @author Gabriel
 */
public class LoShuSquare {
    static void fillMagicSquare(ArrayList<ArrayList<Integer>> magicSquare) {
        int i = magicSquare.size() / 2;
        int j = magicSquare.size() - 1;
        for (int number=1; number<=magicSquare.size() * magicSquare.size();) {
            if (i == -1 && j == magicSquare.size()) {
                j = magicSquare.size() - 2; i = 0;
            } else {
                j = (j == magicSquare.size()) ? 0 : j; 
                i = (i < 0) ? (magicSquare.size() - 1) : i; 
            }
            if (magicSquare.get(i).get(j) != 0) { 
                j -= 2; i++;
            } else {
                magicSquare.get(i).set(j, number);
                j++; i--; number++;
            }
        }
    }
    static void printMagicSquare(ArrayList<ArrayList<Integer>> magicSquare){
        for (int i=0; i<magicSquare.size(); i++){
            for (int j=0; j<magicSquare.size(); j++){
                System.out.print(magicSquare.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
 public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> magicSquare = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("please enter an odd number: ");
            return;
        }
        for (int i=0; i<n; i++){
            magicSquare.add(new ArrayList<>());
            for (int j=0; j<n; j++){
                magicSquare.get(i).add(0);
            }
        }
        fillMagicSquare(magicSquare);
        printMagicSquare(magicSquare);
    }
}
