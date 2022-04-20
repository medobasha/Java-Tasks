class DivisisionByZeroException extends Exception{
    DivisisionByZeroException(String errorMessage){
        super(errorMessage);
    }
}

class ArithmeticException  extends Exception{
    ArithmeticException(String errorMessage){
        super(errorMessage);
    }
}

class IOException extends Exception{
    IOException(String errotMessage){
        super(errotMessage);
    }
}


class Car {
    public float fual(int current, int total) throws DivisisionByZeroException{
        if(total == 0)
            throw new DivisisionByZeroException("Cannot Divide By Zero");
        return ((current / total) * 100);
    }
    
    public float speed(int distance, int time) throws ArithmeticException{
        if(time <= 0)
            throw new ArithmeticException("Time value is illegal");
        return (distance / time);
    }
    
    public void myCar(String car) throws IOException{
        if(car == "Fiat")
            throw new IOException("This is not acceptable as car name");
        System.out.println("Your Car is " + car);
    }
}

class TestCases{
     public static void main(String []args){
        Car newCar = new Car();
        try {
            newCar.fual(0 , 0);
        } 
        catch (DivisisionByZeroException e) {
            System.out.println(e.getMessage());
        }

	try {
            newCar.speed(0,12);
		}	
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
	try {
            newCar.myCar("Fiat");	
}
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

     }
}