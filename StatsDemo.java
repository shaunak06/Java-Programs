import java.text.DecimalFormat; //for number formatting
import java.util.Scanner;  //for keyboard input
import java.io.*;  //for using files

public class StatsDemo
{
  public static void main(String [] args)throws IOException
  {
    double sum = 0;  //the sum of the numbers
    int count = 0;  //the number of numbers added
    double mean = 0;   //the average of the numbers
    double stdDev = 0; //the standard deviation of the numbers
    String line;  //a line from the file
    double difference; //difference between the value and the mean
    
    //create an object of type Decimal Format
    DecimalFormat threeDecimals = new DecimalFormat("0.000");
    //create an object of type Scanner
    Scanner keyboard = new Scanner (System.in);
    String filename; // the user input file name
    
    //Prompt the user and read in the file name
    System.out.println("This program calculates statistics"
                         + "on a file containing a series of numbers");
    System.out.print("Enter the file name:  ");
    filename = keyboard.nextLine();
    
    //ADD LINES FOR TASK #4 HERE
    //Create a FileReader object passing it the filename
    FileReader fileR = new FileReader(filename);
    //Create a BufferedReader object passing it the FileReader object.
    BufferedReader reader = new BufferedReader(fileR);
    //priming read to read the first line of the file
    line = reader.readLine();
    
    //create a loop that continues until you are at the end of the file
    while(reader.readLine() != null)
    {
    //convert the line into a double value and add the value to the sum
      sum += Double.parseDouble(line);
    //increment the counter
      count++;
    //read a new line from the file
      line = reader.readLine();
    }
    //close the input file
    reader.close();
    //store the calculated mean
    mean = (sum / count);
    
    //ADD LINES FOR TASK #5 HERE
    //reconnect to the FileReader object passing it the filename
    fileR = new FileReader(filename);
    //reconnect to the BufferedReader object passing it the FileReader object.
    reader = new BufferedReader(fileR);
    //reinitialize the sum of the numbers
    sum = 0;
    //reinitialize the number of numbers added
    count = 0;
    //priming read to read the first line of the file
    line = reader.readLine();
    //loop that continues until you are at the end of the file
    while(reader.readLine() != null)
    {    
    //convert the line into a double value and subtract the mean
      difference = Double.parseDouble(line) - mean;
    //add the square of the difference to the sum
      sum += (difference * difference);
    //increment the counter
      count++;
    //read a new line from the file
      line = reader.readLine();
    }
    //close the input file
    reader.close();
    System.out.println(sum);
    System.out.println(count);
    //store the calculated standard deviation
    stdDev = Math.sqrt(sum / count);
    
    
    //ADD LINES FOR TASK #3 HERE
    //create an object of type FileWriter using “Results.txt”
    
    FileWriter fileW = new FileWriter("Results.txt");
    //create an object of PrintWriter passing it the FileWriter object.
    PrintWriter outputFile = new PrintWriter(fileW);
    //print the results to the output file
    outputFile.println("The mean is: " + threeDecimals.format(mean));
    outputFile.println("The standard deviation is: " + threeDecimals.format(stdDev));
    //close the output file
    outputFile.close();
  }
}