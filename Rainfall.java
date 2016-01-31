/** This program has data for the rainfall over the course of one year*/
//Shaunak Pandit
//CSI 310

import java.util.Scanner;
public class Rainfall
{
  /*Array that holds the rainfall values*/
  static double rain[] = new double[12];
  /*Scanner object to get user input*/
  static Scanner patrickHasShittyVariables = new Scanner(System.in);
  /*Array that holds the name of the months in order*/
  static String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
  
  public static void main(String[]args)
  {
    for(int i = 0; i < rain.length; i++)
    {
        System.out.println("Please enter the rainfall for " + month[i]);
        rain[i] = patrickHasShittyVariables.nextDouble();
        while(rain[i] < 0)
        {
          System.out.println("Please enter a positive number for " + month[i]);
          rain[i] = patrickHasShittyVariables.nextDouble();
        }
    }
    System.out.println("The  total rainfall for the whole year was " + getTotalRainfall());
    System.out.println("The average raifall for the whole year was " + getAverageRainfall());
    System.out.println("The month with the most rainfall was " + getMonthMostRain());
    System.out.println("The month with the least rainfall was " + getMonthLeastRain());
  }
  /**
   * Method that returns the total rainfall over the year
   * @return double total rainfall */
  public static double getTotalRainfall()
  {
    int total = 0;
    for(int i = 0; i < rain.length; i++)
    {
      total += rain[i];
    }
    return total;
  }
  /**
   * Method that returns the average rainfall
   * @return double average rainfall */
  public static double getAverageRainfall()
  {
    double average = 0;
    average = getTotalRainfall() / 12;
    return average;
  }
  /**
   * Method that returns the month with the most rain
   * @return String of the month with the most rain */
  public static String getMonthMostRain()
  {
    int most = 0;
    double mostRain = 0;
    for(int i = 0; i < 12; i++)
    {
      if(rain[i] > mostRain)
      {
        mostRain = rain[i];
        most = i;
      }
    }
    return month[most];
  }
  /**
   * Method that returns the month with the least rain
   * @return String of the month with the least rain */
  public static String getMonthLeastRain()
  {
    int least = 0;
    double leastRain = rain[0];
    for(int i = 0; i < 12; i++)
    {
      if(rain[i] < leastRain)
      {
        leastRain = rain[i];
        least = i;
      }
    }
    return month[least];
  }
  
}
  
    