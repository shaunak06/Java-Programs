/*
 * This program takes how many miles you have driven and how much gas you have used and returns the cars fuel consumption
 */
import java.util.Scanner;
public class Mileage
{
  
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in); //scanner object to read user input
    double miles; //variable that holds the user input of how many miles driven
    double gallons; //variable that holds the number of galons used
    double mpg; //variable that holds the calculation of the cars mileage
    
    System.out.println("This program calculates gas mileage");
    System.out.println("Please enter how many miles were driven:"); //ask the user for miles driven
    miles = keyboard.nextDouble();
    System.out.println("Please enter how many gallons were used:"); //ask the user for gas consumption
    gallons = keyboard.nextDouble();
    mpg = miles / gallons; //calculation that returns the gas mileage
    System.out.println("The mileage of your car is:" + mpg); //promps the user of their car's gas mileage
    
  }
}