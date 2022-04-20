import java.io.*;
import java.util.*;
class MyException extends Exception{
	MyException(){
		super();
	}
	MyException(String masg){
		super(masg);
	}
	

}

class Methods{
	Methods(){}
	public void sendName(String name) throws MyException{
		if(name.length() < 3){
			throw new MyException("Error : the length of name is short");
		}
	}
	public void sendList(int num[]) throws MyException{
		int x = 0;
		if (num.length < 5 )  {
			throw new MyException("Error : the length of list is short");
		}
	}
	public void checkAge(int age) throws MyException{
		if (age < 22  )  {
			throw new MyException("Error : you are ilgal");
		}
	}
	

}




 class LabException{

	public static void main(String args[]){
		int num[] = {1,2,3,4};
		Methods obj = new Methods();
		try{
			obj.sendName("mo");
		}catch (MyException e) {

			System.out.println(e.getMessage());
		}
		try{
			obj.sendList(num);
		}catch (MyException e){
			System.out.println(e.getMessage());
		}
		try{
			obj.checkAge(19);
		}catch (MyException e){
			System.out.println(e.getMessage());
		}

	}
}


