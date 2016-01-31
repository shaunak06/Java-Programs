//Shuanak Pandit
//CSI 201

import java.util.Scanner;

/**
 This program demonstrates static methods
 */

public class Geometry
{
  /**
   * This is a static method that prints a list of options from which the user picks 
   */
  public static void printMenu()
  {
    System.out.println("This is a geometry calculator \n"
                         + "Choose what you would like to calculate \n"
                         + "1. Find the area of a circle \n" 
                         + "2. Find the area of a rectangle \n"
                         + "3. Find the area of a triangle \n"
                         + "4. Find the circumference of a circle \n" 
                         + "5. Find the perimeter of a rectangle \n"
                         + "6. Find the perimeter of a triangle \n"
                         + "Enter the number of your choice: ");
   }
  
  /**
   * This is a static method that calculates the area of a circle
   * The method requires Math.PI so that it can do the exact calculations
   * @param radius of the circle
   * @return returns the area of the circle
   */
   public static double circleArea(double radius)
   {
     double area = 0;
     area = Math.PI * (radius * radius);
     return area;
   }
    
   /**
    * This is a static method that calcualtes the area of a rectangle
    * @param length of the rectangle
    * @param width of the rectangle
    * @return the area of the rectangle
    */
   public static double rectangleArea(double length, double width)
   {
     double area = 0;
     area = length * width;
     return area;
   }
   
   /**
    * This is a static method that calcualtes the area of a triangle
    * @param base of the triangle
    * @param height of the triangle
    * @return the area of the triangle
    */
   public static double triangleArea(double base, double height)
   {
     double area = 0;
     area = (1.0/2.0) * base * height;
     return area;
   }
   
   /**
    * This is a static method that calculates the circumference of a circle
    * Requires Math.PI to calcualte the exact values
    * @param radius of the circle
    * @return the circumference of the circle
    */
   public static double circleCircumference(double radius)
   {
     double circumference = 0;
     circumference = 2 * Math.PI * radius;
     return circumference;
   }
   
   /**
    * This is a static method that calculates the perimeter of a rectangle
    * @param length of the rectangle
    * @param width of the rectangle
    * @return the perimeter of the rectangle
    */
   public static double rectanglePerimeter(double length, double width)
   {
     double perimeter = 0;
     perimeter = 2 * length + 2 * width;
     return perimeter;
   }
   
   /**
    * This is a static method that takes the sides of a trangle and returns the perimeter
    * @param side1 the first side of the triangle
    * @param side2 the second side of the triangle
    * @param side3 the third side of the triangle
    * @return the perimeter of the triangle
    */
   public static double trianglePerimeter(double side1, double side2, double side3)
   {
     double perimeter = 0;
     perimeter = side1 + side2 + side3;
     return perimeter;
   }
    
    public static void main (String [] args)
  {
    int choice;   //the user's choice
    double value = 0; //the value returned from the method
    char letter;  //the Y or N from the user's decision to exit
    double radius;  //the radius of the circle
    double length;  //the length of the rectangle
    double width;  //the width of the rectangle
    double height;  //the height of the triangle
    double base;  //the base of the triangle
    double side1;  //the first side of the triangle
    double side2;  //the second side of the triangle
    double side3;  //the third side of the triangle
    
    //create a scanner object to read from the keyboard
    Scanner keyboard = new Scanner (System.in);
    
    //do loop was chose to allow the menu to be displayed first
    do
    {
      //call the printMenu method
      printMenu();
        
        choice = keyboard.nextInt();
      
      switch (choice)
      {
        case 1:
          System.out.print("Enter the radius of the circle:  ");
          radius = keyboard.nextDouble();
          //call the circleArea method and store the result in the value variable
          value = circleArea(radius);
          
          System.out.println("The area of the circle is " + value);
          break;
        case 2:
          System.out.print("Enter the length of the rectangle:  ");
          length = keyboard.nextDouble();
          System.out.print("Enter the width of the rectangle:  ");
          width = keyboard.nextDouble();
          //call the rectangleArea method and store the result in the value variable
          value = rectangleArea(length, width);
          
          System.out.println("The area of the rectangle is " + value);
          break;
        case 3: 
          System.out.print("Enter the height of the triangle:  ");
          height = keyboard.nextDouble();
          System.out.print("Enter the base of the triangle:  ");
          base = keyboard.nextDouble();
          //call the triangleArea method and store the result in the value variable
          value = triangleArea(base, height);
          
          System.out.println("The area of the triangle is " + value);
          break;
        case 4:
          System.out.print("Enter the radius of the circle:  ");
          radius = keyboard.nextDouble();
          //call the circumference method and store the result in the value variable
          value = circleCircumference(radius);
          
          System.out.println("The circumference of the circle is " + value);
          break;
        case 5:
          System.out.print("Enter the length of the rectangle:  ");
          length = keyboard.nextDouble();
          System.out.print("Enter the width of the rectangle:  ");
          width = keyboard.nextDouble();
          //call the perimeter method and store the result in the value variable
          value = rectanglePerimeter(length, width);
          
          System.out.println("The perimeter of the rectangle is " + value);
          break;
        case 6:
          System.out.print("Enter the length of side 1 of the triangle:  ");
          side1 = keyboard.nextDouble();
          System.out.print("Enter the length of side 2 of the triangle:  ");
          side2 = keyboard.nextDouble();
          System.out.print("Enter the length of side 3 of the triangle:  ");
          side3 = keyboard.nextDouble();
          //call the perimeter method and store the result in the value variable
          value = trianglePerimeter(side1, side2, side3);
          
          System.out.println("The perimeter of the triangle is " + value);
          break;
        default:
          System.out.println("You did not enter a valid choice.");
      } 
      keyboard.nextLine(); //consumes the new line character after the number      
      System.out.println("Do you want to exit the program (Y/N)?:  ");
      String answer = keyboard.nextLine();
      letter = answer.charAt(0);
    }while (letter != 'Y' && letter != 'y');
  }
  }