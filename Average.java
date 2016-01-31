//Shaunak Pandit
//CSI 201
/*This is a class that calculated the average*/
import java.util.Scanner;

public class Average
{
  
  int[] data = new int[5];
  double mean = 0;
  /** default constructor*/
  public Average()
  {
    Scanner fBhitchesGetGrades = new Scanner(System.in);
    for(int i = 0; i < 5; i++)
    {
      System.out.println("Please enter test score number " + (i + 1) + ": ");
      data[i] = fBhitchesGetGrades.nextInt();
    }
      selectionSort(data);
      calculateMean(data);
    
  }
  /**caluclateMean method that calcualtes the mean
    * @param the array of test scores*/
  public void calculateMean(int[] myArray)
  {
    int sum = 0;
    for(int i = 0; i < 5; i++)
    {
      sum += myArray[i];
    }
     mean = sum / 5;
  }
  /**toString returns the string of the test scores and mean
    * @return the string*/
  public String toString()
  {
    String output = "";
    for(int i = 0; i < 5; i++)
    {
      output += "Data Point " + i + ":" + data[i] + " ";
    }
    output += " " + mean;
    return output;
  }// toString
  /**selectionSort method to sort the array of scores
    * @param the array with the scores*/
  public void selectionSort(int[] myArray)
  {
    for(int i= 0; i < myArray.length - 1; i++)
    {
      for(int j= i + 1; j < myArray.length; j++)
      {
        if(myArray[i] < myArray[j])
        {
          int temp= myArray[i];
          myArray[i]= myArray[j];
          myArray[j]= temp;
        }// if
      }// for inner
    }// for outer
  }// selection sort
}// class