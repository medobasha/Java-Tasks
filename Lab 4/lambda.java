import java.util.function.BiPredicate;


class Test_Str{

    public String check(String s1,String s2, BiPredicate<String,String> biPredicate){
        if(biPredicate.test(s1, s2)){
            return "'"+s1+"' is better '"+s2+"'";
        }
        else{
            return "'"+s2+"' is better '"+s1+"'";
        }
    }
}

class StrClass{

    public static void main(String args[]) {
        String str1 ="mohamed";
        String str2 = "mohamed ibrahem";

        Test_Str test = new Test_Str();
        //Lambda expression
       String w = test.check(str1, str2, (s1,s2) -> {
           if(s1.length() > s2.length())
                return true;
            else 
                return false;
            });
       
            System.out.println(w);
      


    }


}