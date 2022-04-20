// Count a group of words using regular expressions

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Groupofword {
   public static void main(String[] args) {
      String sentence = "canhkfdhfdcanknkncanknknkcanknkncanknkncan";
      Pattern pattern = Pattern.compile("can");
      Matcher  matcher = pattern.matcher(sentence);
      int count = 0;
      
      System.out.println("The word to be found is '" + pattern + "'");
      System.out.println("The sentence to find in is ---- " + sentence + "----");
      while (matcher.find())count++;
      System.out.println("Number of words with same pattern :----- " + count);
   } 
}