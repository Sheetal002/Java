public class PolymorphismExample {
	public int product(int a, int b) {
	int c = a*b;
	System.out.println(c);
}
	public double product(double a, double b) {
	double c = a*b;
	System.out.println(c);
}

public static void main(String[] args){
	PolymorphismExample pe = new PolymorphismExample();
	System.out.println(pe.product(2,3));
	System.out.println(pe.product(2.5,3.5));
}
}