import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class MyLetter{
    public boolean checkString(char ltr){
        return Character.isLetter(ltr);
    }

    public static boolean myStringList(char[] strChars, Predicate<Character> pre){
        List<Character> myList = new ArrayList<>();
        boolean flag = true;
        for(Character chars:strChars){
            if(pre.test(chars)){
                myList.add(chars);
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}




class LetterString {
    public static void main(String[] args) {
        String str = "Hello Java12";
        char [] strChars = str.toCharArray();
        List<Character> charsList = new ArrayList<>();
        for(char ch: strChars){
            charsList.add(ch);
        }
        //check letters in strChars by referance to stringList static method
        MyLetter myLetter = new MyLetter();
        if(MyLetter.myStringList(strChars, myLetter::checkString)){
            System.out.println("COntains alphapets only");
        }
        else {
            System.out.println("Not aplphapets only");
        }
    }
}