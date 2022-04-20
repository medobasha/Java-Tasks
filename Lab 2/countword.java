/*your task is that to count the number of occurrences of the given word 
in the string and print the number of occurrence of the word.*/

import java.io.*;
 
class Countword {
 
static int count(String str, String word)
{
    // we will split the string by spaces in a
    String arr[] = str.split(" ");
 
    // search for pattern in a
    int count = 0;
    for (int i = 0; i < arr.length ; i++)
    {
    // if there is a match,increase the count
    if (word.equals(arr[i]))
        count++;
    }
 
    return count;
}
 

public static void main(String args[])
{
    String str = "He can can a can in can but she can't can a can in a can";
    String word = "can";
    System.out.println("The sentence is '" +str +"'");
    System.out.println("The number of occurences for word --"+ word + "-- is: " + count(str, word));
}
}