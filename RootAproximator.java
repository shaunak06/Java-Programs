
//program that uses Heron's method to generate the square root of a number
//by Shaunak Pandit
public class RootAproximator 
{
  public static void main(String[] args) 
 {
  // TODO Auto-generated method stub
  RootAproximator ra = new RootAproximator(4.75);
  System.out.println(ra.nextGuess());
  System.out.println(ra.hasMoreGuesses());
 }
 
 private double epsilon;
 private double guess = 1.0;
 private double num;
 
 //default constructor
 public RootAproximator()
 {
  epsilon = 0.000001;
  num = 1.0;
 }
 
 //constructor with both params
 public RootAproximator(double a, double e)
 {
  num = a;
  epsilon = e;
 }
 
 //constructor for only a
 public RootAproximator(double a)
 {
  num = a;
  epsilon = 0.000001;
 }
 
 //gets the next better guess
 public double nextGuess()
 {
  guess = (guess + (num / guess)) / 2;
  return guess;
 }
 
 //tells the user if there are more guesses
 public boolean hasMoreGuesses()
 {
  if ((Math.abs(guess - (((num / guess) + guess) / 2))) <= epsilon)
  {
   return false;
  }
  else
  {
   return true;
  }
 }
 
 //toString method
 public String toString()
 {
  return "The square route of " + num + "will be " + epsilon + "away from the actual value.";
 }
}
