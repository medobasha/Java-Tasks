/*using StringTokenizer class*/

import java.util.*;


public class CountTokens {
public static int counttokens(String sentence, String word) {
 if (sentence == null || sentence.isEmpty())
 {
	 return 0; 
	 }

 StringTokenizer tokens = new StringTokenizer(sentence);
 int counter = 0;
 while(tokens.hasMoreTokens()){
	 if(tokens.nextToken().contains(word))
	 {
	 counter++;
	 }
 }
 return counter;
}
 
 static public void main(String[] args) {
        String sentence = "He can can a can in a can but she can't can a can in a can";       
        String word = "can";       
        System.out.println("The word to be count is '" + word + "'");
        System.out.println("The word to be count is '" + sentence + "'");
        System.out.println("The number of occurences is: " + counttokens(sentence, word)); 		
		}
 
}
