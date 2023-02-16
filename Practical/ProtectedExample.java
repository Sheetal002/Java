
public class ProtectedExample extends Person{
	
	private String name1 = "Manisha";
	
	public static void main(String[] args) {
		ProtectedExample d = new ProtectedExample();
		System.out.println("Name: "+d.name);
		System.out.println("Phone no: "+d.numph);
		System.out.println("friend: "+d.name1);
		
	}
}
