import java.util.Scanner;
public class MorseCodeTester
{
  public static void main(String[] args)
  {
    MorseCode mc;
    Scanner patHasSmallBalls = new Scanner(System.in);
    System.out.println("Please enter a sentence to be converted to moarse code!");
    String input = patHasSmallBalls.nextLine();
    mc = new MorseCode(input);
    System.out.println(mc.convert());
    patHasSmallBalls.close();
  }
}