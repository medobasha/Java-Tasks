/*Develop an application that extracts the minimum and maximum
 of the elements of an array of 1000 element and compute the search running time.*/

import java.util.Random;
import java.util.Arrays;

public class MinMax {

   public static void main(String[] args) { 

      // create an instance of Random class for random number generation 
      Random random = new Random (1L);
	  
      // create an int array of 1000 elements
	  
	  int[] dataArray = new int[1000];
	  
      // populate the array with randomly generated values
	  System.out.println("Content of array:");
      for (int index = 0; index < 1000; index++)
	  {
        dataArray[index] = random.nextInt();
		System.out.println("Element no." + (index + 1) + ": " + dataArray[index]);
	  }
	  
	  /*Arrays.sort(dataArray);
	  System.out.println("Sorted form of array:");
	  for (int index = 0; index < 1000; index++)
	  {
		System.out.println("Element no." + (index + 1) + ": " + dataArray[index]);
	  }*/
	  
	  int Min = dataArray[0];
	  int Max = dataArray[0];
	  
	  // starting searching time
	  long startTime = System.nanoTime();
	  
	  //searching for minimum and maximum
	  for(int i = 0 ; i < 1000 ; i++)
	  {
		  if(dataArray[i] < Min) Min = dataArray[i];
		  if(dataArray[i] > Max) Max = dataArray[i];
	  }
	  System.out.println("\nThe minimum value is: " + Min);
	  System.out.println("\nThe maximum value is: " + Max);
	  
      // estimated searching time
	  long estimatedTime = System.nanoTime() - startTime;
	  System.out.println("\nThe estimated searching time is: " + estimatedTime + " ns");
      
  }
}