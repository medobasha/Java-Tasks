import java.math.BigDecimal;

public class Complex <T extends BigDecimal, R extends BigDecimal>{
	private T real;
	private R img;  
   	public Complex(T real, R img){
		this.real = real;
		this.img = img;
  	}
   	public Complex<T, R> sum(Complex<T, R> c){
		return new Complex <T, R>((T)(this.real.add( c.getReal())),(R)( this.img.add( c.getImg())));
   	}
	public Complex<T, R>  sub(Complex<T, R> c){
		return new Complex <T, R>((T)(this.real.subtract(c.getReal())),(R)(this.img.subtract(c.getImg())));
   	}
	public Complex<T, R>  mul(Complex<T, R> c){
		return new Complex <T, R>((T)(this.real.multiply(c.getReal())),(R)(this.img.multiply(c.getImg())));
   	}
	public T getReal(){
		return real;
	}
	public R getImg(){
		return img;
	}
}


