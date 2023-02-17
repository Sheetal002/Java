
public class SingleArrayEg {

	static void showArray() {
		int arr1[] = {1,4,8,3,9};
		for(int a:arr1) {
			System.out.println(" "+a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showArray();
		int myarray[] = new int[4]; //declaration & instantiation
		myarray[0] = 78;
		myarray[1] = 27;
		myarray[2] = 70;
		myarray[3] = 97;
		
		System.out.println(myarray[2]); //value at index2
		
		//traversing an array
		for(int i=0; i<myarray.length; i++) {
			System.out.println(myarray[i]);
		}
		float num[] = {3.3f, 5.5f,8.3f, 9.8f}; //declaration & instantiaion
		
		//print num array
		System.out.println("Array elements: ");
		for(float j:num) {
			
			System.out.print(j+ " , ");
		}
		
	}

}
