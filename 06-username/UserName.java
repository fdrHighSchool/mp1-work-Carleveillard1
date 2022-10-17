import java.util.Scanner;
import java.util.Random;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    
    int rand_int1 =rand.nextInt(10);
    int rand_int2 =rand.nextInt(10);
    int rand_int3 =rand.nextInt(10);
    int rand_int4 =rand.nextInt(10);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Whats your favorite number: ");
    String Number = s.nextLine();
    System.out.print("Are you a teacher or a student: ");
    String Lable = s.nextLine();
    if(Lable .equals("teacher")) {
        System.out.println(firstName.substring(0, 1) + lastName + Number + "@schools.nyc.gov");
        
    }
    if(Lable .equals("student")) {
        System.out.println(firstName + lastName.substring(0, 1) + Number + "@nycstudents.net");
        
    }
    System.out.print("Your password is " + rand_int1 + rand_int2 + rand_int3 + rand_int4);
    
    // test output
    //System.out.println("Hello " + initialize(firstName) + "." + initialize(lastName) + ".");
    

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class