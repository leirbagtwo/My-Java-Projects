package MP6;
import java.util.Scanner;
import java.util.Random; 
/**
 @author Gabriel
 */
public class MP3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = 5;
        int max = 10;
        Random random = new Random(); 
        int [] arr = new int [size];
        int [] lottery = new int [size];
        for(int i=0;i<size;i++)
        lottery[i]=random.nextInt(max)+1;
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
        int count=0;
        for(int i=0;i<size;i++)
        if(arr[i]==lottery[i])
        count++;
        System.out.println("Lottery :");
        for(int i=0;i<size;i++)
        System.out.println(lottery[i]+" ");

        System.out.println("User :");
        for(int i=0;i<size;i++)
        System.out.println(arr[i]+" ");

        if(count==size){
        System.out.println("Congratulations. You are the grand prize winner");
        }
        else{
        System.out.println("There are "+count+" matching digits") ; 
      }
   }
}
        

