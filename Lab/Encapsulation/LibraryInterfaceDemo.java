package lab2;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers ku1 = new KidUsers();
		KidUsers ku2 = new KidUsers();
		ku1.age = 10;
		ku2.age = 18;
		ku1.registerAccount();
		ku2.registerAccount();
		ku1.bookType = "Kids";
		ku2.bookType = "Fiction";
		ku1.requestBook();
		ku2.requestBook();
		
		
		
		AdultUser au1 = new AdultUser();
		AdultUser au2 = new AdultUser();
		au1.age = 5;
		au2.age = 23;
		au1.registerAccount();
		au2.registerAccount();
		au1.bookType = "Kids";
		au2.bookType = "Fiction";
		au1.requestBook();
		au2.requestBook();
		
	}
}
