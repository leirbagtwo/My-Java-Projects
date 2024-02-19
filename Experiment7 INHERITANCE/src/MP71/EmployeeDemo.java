package MP71;
/**
 * @author Gabriel
 */
public class EmployeeDemo {
  public static void main(String[] args) {

    System.out.print("Welcome to the ABC INC.");

    TeamLeader tl1 = new TeamLeader
        ("Marie Curie", "987-D", "03/14/1867", 1, 100, 24000, 100, 50);

    TeamLeader tl2 = new TeamLeader
        ("Michael Faraday", "987-D", "08/25/1867", 2, 100, 24000, 100, 50);

 
    System.out.println("\nThis is the Day Team Leader object: ");
    System.out.println(tl1);


    System.out.println("\nThis is the Night Team Leader object: ");
    System.out.println(tl2);
  } 
} 

