class My{

	public static void display() {//static method
		System.out.println("Hi ....");
		}
}
class Hello{//start of the class
	public static void main(String args[]){ //entry point
		System.out.println("Its my first program.");
		
		My.display(); //classname.methodname
	}
}//end of the class