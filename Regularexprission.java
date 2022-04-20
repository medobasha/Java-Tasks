/*Count a group of words in a string using regular expressions*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regularexprission{
   public static void main(String[] args) {
      String s = "stringpatternfinfing";
      Pattern pattern = Pattern.compile("str");
      Matcher  matcher = pattern.matcher(s);
      int count = 0;
      
      while (matcher.find())count++;
      System.out.println("Number of groups: " + count);
   } 
}