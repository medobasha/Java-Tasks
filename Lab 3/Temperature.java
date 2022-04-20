import java.util.*; 
import java.util.function.Function;

class Convert
{
	public static Float Fahrenheit(Float t)
	{
		Function<Float, Float> equ = q -> ((q*9)/5)+32;
		return equ.apply(t);	
	}
}

public class Temperature 
{
	public static void main(String[] args) 
	{ 
		float temp;
		temp = Float.parseFloat(args[0]);
		
		System.out.println("Temperature in Fahrenheit is -----------> \" " + Convert.Fahrenheit(temp) + "\"");
	}
}