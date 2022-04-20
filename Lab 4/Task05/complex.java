import java.math.BigDecimal;

class Complex<T extends BigDecimal, R extends BigDecimal> {
    T real;
    R img;

    Complex(T r, R i) {
        real = r;
        img = i;
    }

    public void setreal(T r) {
        real = r;
    }

    public void setimg(R i) {
        img = i;
    }

    public T getreal() {
        return real;
    }

    public R getimg() {
        return img;
    }

    public Complex<T, R> add(Complex<T, R> other) {
        return new Complex<T, R>((T) (real.add(other.real)), (R) (img.add(other.img)));
    }

    public Complex<T, R> add(Complex<T, R> c1, Complex<T, R> c2) {
        return new Complex<T, R>((T) (c1.getreal().add(c2.getreal())), (R) (c1.getimg().add(c2.getimg())));
    }

    public Complex<T, R> subtract(Complex<T, R> other) {
        return new Complex<T, R>((T) (real.subtract(other.real)), (R) (img.subtract(other.img)));
    }

    public Complex<T, R> subtract(Complex<T, R> c1, Complex<T, R> c2) {
        return new Complex<T, R>((T) (c1.getreal().subtract(c2.getreal())), (R) (c1.getimg().subtract(c2.getimg())));
    }

    public Complex<T, R> multiply(Complex<T, R> other) {
        return new Complex<T, R>((T) (real.multiply(other.real)), (R) (img.multiply(other.img)));
    }

    public Complex<T, R> multiply(Complex<T, R> c1, Complex<T, R> c2) {
        return new Complex<T, R>((T) (c1.real.multiply(c2.real).subtract(c1.img.multiply(c2.img))),
                (R) (c1.img.multiply(c2.real).add(c1.real.multiply(c2.img))));

    }

    void display() {
        System.out.println("the real part is " + getreal());
        System.out.println("the img part is " + getimg());

    }

}

class Example {

    public static void main(String args[]) {
        Complex<BigDecimal, BigDecimal> c = new Complex<>(new BigDecimal(10.5), new BigDecimal(10));
        Complex<BigDecimal, BigDecimal> c2 = new Complex<>(new BigDecimal(2), new BigDecimal(3));
        Complex<BigDecimal, BigDecimal> c3 = new Complex<>(new BigDecimal(0), new BigDecimal(0));
        Complex<BigDecimal, BigDecimal> c4 = new Complex<>(new BigDecimal(0), new BigDecimal(0));
        Complex<BigDecimal, BigDecimal> c5 = new Complex<>(new BigDecimal(0), new BigDecimal(0));
        System.out.println("the summation of two complex");
        c3 = c.add(c2);
        c3.display();
        System.out.println("the subtraction of two complex");
        c4 = c.subtract(c2);
        c4.display();
        System.out.println("the multiplication of two complex");
        c5 = c.multiply(c2, c);
        c5.display();

    }
}