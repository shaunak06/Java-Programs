/**
 This program demonstrates how numeric types and operators behave in Java
 */

import java.util.Scanner;

public class NumericTypes
{
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    //identifier declarations
    final int NUMBER = 2 ;  // number of scores
    final int SCORE1 = 100;  // first test score
    final int SCORE2 = 95;  // second test score
    final int BOILING_IN_F = 212;  // freezing temperature
    int fToC;      // temperature in celsius
    double average;    // arithmetic average
    String output;     // line of output to print out
    String firstName;
    String lastName;
    String fullName;
    char firstInitial;
    double diameter;
    double radius;
    double volume;
    
    // Find an arithmetic average
    average = (SCORE1 + SCORE2) / NUMBER; //added quotations so that 
    output = SCORE1 + " and " + SCORE2 + " have an average of "
      + average;
    System.out.println(output);
    
//    // Convert Fahrenheit temperatures to Celsius
//    fToC = ((5* (BOILING_IN_F - 32))/9); //switched around the equation and got it to work
//    output = BOILING_IN_F + " in Fahrenheit is " + fToC
//      + " in Celsius.";
//    System.out.println(output);
//    System.out.println();  // to leave a blank line
    
//    System.out.println("Please print your first name:");
//    firstName = keyboard.nextLine();
//    System.out.println("Please print your last name:");
//    lastName = keyboard.nextLine();
//    fullName = firstName + lastName;
//    System.out.println(fullName);
//    
//    System.out.println();  // to leave a blank line
//    
//    // ADD LINES FOR TASK #3 HERE
//    firstInitial = firstName.charAt(0);
//    System.out.println(firstInitial);
//    fullName = fullName.toUpperCase();
//    System.out.println(fullName);
//    
//    System.out.println();  // to leave a blank line
    
    // ADD LINES FOR TASK #4 HERE
    System.out.println("Please enter the diameter of a circle:");
    diameter = keyboard.nextDouble();
    radius = (diameter / 2);
    System.out.println(radius);
    volume = (3.0/4) * Math.PI * Math.pow(radius, 3);
    System.out.println("The volume of the sphere is:" + volume);
  } 
}