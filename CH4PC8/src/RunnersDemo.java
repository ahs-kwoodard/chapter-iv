import java.util.Scanner; // Needed for the Scanner class

/**
 * Chapter 4
 * Programming Challenge 8: Running the Race
 * This program demonstrates the Runners class.
 */

public class RunnersDemo
{
   public static void main(String[] args)
   {
      String name;      // To hold names
      double time;      // To hold times

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Runners object.
      Runners runners = new Runners();
      
      // Display intro.
      System.out.println("This program displays the " +
                         "first, second, and third");
      System.out.println("place runners in a race.");
      System.out.println("No ties, please.");
      
      // Get the first runner's data.
      System.out.print("Enter the first runner's name: ");
      name = keyboard.nextLine();
      System.out.print("Enter the first runner's time: ");
      time = keyboard.nextDouble();
      runners.setRunner1(name);
      runners.setTime1(time);
      
      // Get the second runner's data.
      System.out.print("Enter the second runner's name: ");
      name = keyboard.nextLine();   // Consume the remaining newline
      name = keyboard.nextLine();
      System.out.print("Enter the second runner's time: ");
      time = keyboard.nextDouble();
      runners.setRunner2(name);
      runners.setTime2(time);
   
      // Get the third runner's data.
      System.out.print("Enter the third runner's name: ");
      name = keyboard.nextLine();   // Consume the remaining newline
      name = keyboard.nextLine();
      System.out.print("Enter the third runner's time: ");
      time = keyboard.nextDouble();
      runners.setRunner3(name);
      runners.setTime3(time);
      
      // Display the results.
      System.out.println("First place: " +
                         runners.getFirstPlace());
      System.out.println("Second place: " +
                         runners.getSecondPlace());
      System.out.println("Third place: " +
                         runners.getThirdPlace());
   }
}
