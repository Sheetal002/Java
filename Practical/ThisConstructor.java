class ThisConstructor
{
	ThisConstructor(){
		System.out.println("xyz");
	}
	int a;
	String name;
	public void display(){
		System.out.println(a+" "+ name);
	}
	public static void main(String[] args){
		System.out.println("She");
		ThisConstructor tc= new ThisConstructor();
		tc.display();
	}

}