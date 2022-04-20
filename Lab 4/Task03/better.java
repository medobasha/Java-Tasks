import java.util.function.BiPredicate;
class BetterString{

	public static Boolean getString(String str1, String str2){
		if(str1.length() > str2.length()){
			return true;
		}
		return false;
	}

	public static String checkString(String str1, String str2, BiPredicate<String, String> pred){
		if(pred.test(str1, str2))
			return str1;
		else return str2;
	}

}

class TestString{
	public static void main(String args[]){
		String str1 = "Mohamed";
		String str2 = "SAMIR";
		String myString = BetterString.checkString(str1, str2, BetterString::getString);
		System.out.println(myString);
	}
}