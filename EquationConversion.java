public class EquationConversion
{
  String currentEq = "";
  
  /**default constructor*/
  public EquationConversion()
  {
  }
  
  public EquationConversion(String eq)
  {
    currentEq = eq;
  }
  
  
  /** A method that takes the infix equation and returns the postfix
    * @param a string of the equation
    */
  public String infixToPostfix(String eq)
  {
    LinkedStackClass<String> stack = new LinkedStackClass<String>(); //create the stack object
    stack.initializeStack();//initialize the stack
    char[] arrEq = eq.toCharArray();//create a character array from the input equation
    StringBuilder output = new StringBuilder();//output string builder
    
    for(char part : arrEq)
    {
      //System.out.println("INPUT:"+part);
      if(!(part == ';'))
      {
        if(part == '(') 
        {
          stack.push("" + part);
        }//if
        else if(part == ')') 
        {
          while(!(stack.peek().equals("("))) 
          {
            output.append(stack.peek());
            //System.out.println("OUTPUT1:"+output);
            stack.pop();
          }//while
          if(stack.peek().equals("("))
          {
            stack.pop();
          }//if
        }//else if
        else if(isAnOp(part))
        {
          if(stack.isEmptyStack() || getPrecedence(part) >= getPrecedence(stack.peek().charAt(0)))
          { 
            stack.push("" + part);
          }
          else
          {
            output.append(stack.peek());
            //System.out.println("OUTPUT2:"+output);
            stack.pop();
            stack.push("" + part);
          }
        }
        else 
        {
          output.append("" + part);
          //System.out.println("OUTPUT3:"+output);
        }
      }//if part isnt ;
    }//for
    while(!(stack.isEmptyStack()))
    {
      output.append(stack.peek());
      //System.out.println("OUTPUT4:"+output);
      stack.pop();
    }//while
    return output.toString();
  }//infixToPostfix
  
  /** A method that takes the postfix equation and returns the infix equation
    * @param the equation in the form of a string
    */
  public String postfixToInfix(String eq)
  {
    LinkedStackClass<String> stack = new LinkedStackClass<String>();
    stack.initializeStack();//create and initialize the stack
    char[] arrEq = eq.toCharArray(); //create a character array from the string
    StringBuilder output = new StringBuilder();//output string (its a pallindrome lol)
    
    for(char part : arrEq)
    {
      if(!(part == ';'))
      {
        if(!(isAnOp(part)))
        {
          stack.push("" + part);
          //System.out.println("OUTPUT1:" + stack.peek());
        }//if
        else
        {
          String temp = "";
          temp =stack.peek();
          stack.pop();
          temp = "(" + stack.peek() + part + temp + ")";
          stack.pop();
          stack.push(temp);
          //System.out.println("OUTPUT2:" + stack.peek());
        }//else
      }//if
    }//for
    while(!(stack.isEmptyStack()))
    {
      output.append(stack.peek());
      stack.pop();
    }//while
    return output.toString();
  }//postfixToInfix
  
  public String getInfixString()
  {
    currentEq.replaceAll("\\s+","");
    
    return currentEq;
  }
  
  public String getPostfixString()
  {
    currentEq.replaceAll("\\s+","");
    
    return currentEq;
  }
  
  /** A method that return whether of not the desired character is an operator
    * @param the string of the character
    * @return a boolean value of the result
    */
  public boolean isAnOp(char s)
  {
    boolean r = false;
    switch(s)
    {
      case '+' : case '-' : case '*' : case '/' : case '^' : case '%' :
        r = true;
        break;
      default:
        r = false;
    }
    //System.out.println(r);
    return r;
  }
  /**A method that gets the precedence of a desired operator
    * @param a character operator
    * @return an integer value of the precedence 
    */
  public int getPrecedence(char s)
  {
    int precedence = 0;
    switch (s)
    {
      case '+' : case '-' :
      {
        precedence = 1;
        break;
      }
      case '*' : case '/' : case '%' :
      {
        precedence = 2;
        break;
      }
      case '^' :
      {
        precedence = 3;
        break;
      }
      default :
      {
        precedence = 0;
        break;
      }
    }//switch
    //System.out.println("PRECEDENCE:" + s + " " + precedence);
    return precedence;
  }//getPrecedence
}

