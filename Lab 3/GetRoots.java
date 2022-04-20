import java.util.function.*;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

class Res{
	double root1,root2;
}

class Calulates implements Function<List<Double>, Res>{

	public Res apply(List<Double> arr)
	{
		Res r = new Res();
		double check= Math.sqrt(arr.get(1) * arr.get(1) - 4 * arr.get(0) * arr.get(2));
		
		if(check == 0)
		{
			System.out.println("Root 1 = Root 2 !");
			r.root1 = (-1 * arr.get(1)) / (2 * arr.get(0));				
			r.root2 = r.root1;
			return r;
		}
		else if(check > 0)
		{
			r.root1 = ((-1 * arr.get(1)) + check) / (2 * arr.get(0));
			r.root2 = ((-1 * arr.get(1)) - check) / (2 * arr.get(0));
			return r;
		}
		else if((arr.get(1) * arr.get(1) - 4 * arr.get(0) * arr.get(2)) < 0)
		{
			System.out.println("Both Roots are imaginary numbers!");
			r.root1 = (-1 * arr.get(1)) / (2 * arr.get(0));
			r.root2 = r.root1;
			return r;
		}
		else 
		{
			return r;
		}
		
	}
}

class GetRoots{ 

	public static void main(String args[]){

		String reg = "^[+-]?(([1-9]\\d*)|0)(\\.\\d+)?";
		if((args.length == 3) && (args[0].matches(reg) && (args[1].matches(reg) && args[2].matches(reg)))){
			double n1 = Double.parseDouble(args[0]);
			double n2 = Double.parseDouble(args[1]);
			double n3 = Double.parseDouble(args[2]);
			List<Double> array = new ArrayList<>();
			array.add(n1);
			array.add(n2);
			array.add(n3);
			Function<List<Double>, Res> fun = new Calulates();
			Res re = fun.apply(array);
			if((2 * array.get(0)) > 0){
				if((array.get(1) * array.get(1) - 4 * array.get(0) * array.get(2)) < 0)
				{
					System.out.println("First Root = "+ re.root1 + " + i");
					System.out.println("Second Root = "+ re.root2 + " + i");
				}
				else
				{
					System.out.println("First Root = "+ re.root1);
					System.out.println("Second Root = "+ re.root2);
				}
			}
			else{
				System.out.println("Infinity Roots!");
			}	
		}
	
		else{
			System.out.println("Ivalid Inputs!");
		}
	}
}