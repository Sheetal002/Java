class ComparisonExample{
	public void cal(){
		int a=14 ,b=6;
		System.out.println("a>b:" +(a>b));
		System.out.println("a<b:" +(a<b));
		System.out.println("a>=:" +(a>=b));
		System.out.println("a<=:" +(a<=b));
		System.out.println("a==b:" +(a==b));
		System.out.println("a!=b:" +(a!=b));
		// Logical operator
		System.out.println((a>b)&&(a++<b));//logical and
		System.out.println((a++>b)&&(a<b));
		System.out.println((a>b)||(a<b));//logical or
		//Bitwise operator
		System.out.println((a>b)&(a++>b));//bitwise and
		// Ternary operator
		int x=2;
		int y=3;
		int c=(x>b)? x:y;
		System.out.println(c);
	}
	public static void main(String args[]){
		ComparisonExample obj =new ComparisonExample();
		obj.cal();
	}
}