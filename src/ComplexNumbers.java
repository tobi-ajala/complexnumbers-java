
public class ComplexNumbers {


	public static void main(String[] args) {
		new ComplexNumbers();
	}
	
	ComplexNumbers()
	{
		Complex z1 = new Complex(1.0,1.0);
		Complex z2 = new Complex(2.0,3.0);
		Complex z3;
		z3=addComplex(z1,z2);
		displayComplex(z3);
	}
	
	Complex addComplex(Complex c1, Complex c2)
	{
		Complex c3 = new Complex(0.0,0.0);
		c3.re=c1.re+c2.re;
		c3.im=c1.im+c2.im;
		return(c3);
	}
	
	void displayComplex(Complex z)
	{
		System.out.println("z="+z.re + " j"+z.im);
	}

}
class Complex {
	double re, im;
	public Complex(double re, double im)
	{
		this.re=re;
		this.im=im;
	}

	

}
