
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Date
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String Day = s.nextLine();
        
        System.out.print("Enter the month: ");
        String Month = s.nextLine();
        
        System.out.print("Enter the year: ");
        String Year = s.nextLine();
        
        System.out.print("Enter the day of the month: ");
        String DayofMonth = s.nextLine();
        
        System.out.println(Day+ ", "+ Month + ", "+DayofMonth+", "+Year);
        System.out.println(Day+ ", "+ DayofMonth + ", "+Month+", "+Year);
        
    } // end of main method
   
} // end of class