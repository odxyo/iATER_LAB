package bagicStudy.calculator;

public class CalMathMain {

	double a;
	double b;

	public void setOprands(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void sum() {

		System.out.println("a+b= " + (this.a + this.b));
	}

	public void min() {

		System.out.println("a-b= " + (this.a - this.b));
	}

	public void div() {

		System.out.println("a/b= " + (this.a / this.b));
	}
	
	public void mux() {

		System.out.println("a*b= " + (this.a * this.b));
	}
	
	

	public static void main(String[] args) {

		CalMathMain c1 = new CalMathMain();

		c1.setOprands(10, 20);
		c1.sum();
		c1.min();
		c1.div();
		c1.mux();
	}

}
