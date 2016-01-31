import java.util.Scanner;
public class EquationConversionTester
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    EquationConversion ec = new EquationConversion();
    LinkedListClass<String> equations = new UnorderedLinkedList<String>();/** linked list of the completed conversions*/
    int response = 0;
    String eq = "";
    while(response != 4)
    {
      System.out.println("What would you like to do? \n1. Infix to Postfix \n2. Postfix to Infix \n3. Print Equations \n4. Quit \n");
      response = s.nextInt();
      s.nextLine();
      if(response == 1 || response == 2)
      {
        System.out.println("Please enter your equation: ");
        eq = s.nextLine();
        if(response == 1)
        {
          equations.insertLast(ec.infixToPostfix(eq));
          System.out.println("Infix to postfix completed");
          System.out.println(ec.infixToPostfix(eq));
        }
        else
        {
          equations.insertLast(ec.postfixToInfix(eq));
          System.out.println("Postfix to infix completed");
          System.out.println(ec.postfixToInfix(eq));
        }
      }
      else if(response == 3)
      {
//        equations.LinkedListIterator();
//        while(ref != null)
//        {
//          System.out.println(ref.toString());
//          ref = ref.next();
        }
      }
    System.out.println("Thank you for using the converter!");
    s.close(); 
  }
}