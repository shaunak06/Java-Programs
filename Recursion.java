import java.util.Scanner;


public class Recursion
{
  public static void main (String [] args)
  {
    int choice;
    Scanner keyboard = new Scanner (System.in);
    System.out.println("Enter the amount of intergers you would like to add up:");
    choice=keyboard.nextInt();
    System.out.println(sum_it_up(choice));
    
  }
  
  public static long sum_it_up(int num)
  {
    Scanner stuff = new Scanner(System.in);
    long stuffplace;
    System.out.println("Enter the number you want to add");
    stuffplace=stuff.nextInt();
    if (num==1)
      return stuffplace;
    else 
      return
      stuffplace+sum_it_up(num-1);
  }
}