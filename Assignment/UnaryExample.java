class UnaryExample{
	
	public void calcIncrement(){ // non-static method
		int x = 10;
		System.out.println(x++);//print then execute
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);//incr then print
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
	
    }
	public void calcDecrement(){ // non static method
		int x = 10;
		System.out.println(x--);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		
	}
	
	public static void main(String args[]){
		UnaryExample id = new UnaryExample();// obj creation
		// classname obj = new classname
		id.calcDecrement();
		id.calcIncrement();
		
	}
}