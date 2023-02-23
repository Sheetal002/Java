public class SortedArray{
	public static void main(String args[]){
		int myarr[] = {23, 45, 56, 101, 2};
		int temp;
			int largest = myarr[0];
			int smallest = myarr[0];
			for(int i = 0; i <myarr.length; i++){
			if (largest < myarr[i]) 
			{
			  largest = myarr[i];
			}
			if (smallest > myarr[i])
			{
			smallest = myarr[i];	
			}	
			}
			while (myarr[0] != largest){
			for(int i=1; i<myarr.length; i++){
			if (myarr[i] > myarr[i-1]){
				temp = myarr[i-1];
				myarr[i-1] = myarr[i];
				myarr[i] = temp;
				}
			}}
		System.out.println("Elements in descending order: ");
		for (int element: myarr) {
            System.out.print(element+" ");
      	  }
			while (myarr[0] != smallest){
			for(int i=1; i<myarr.length; i++){
			if (myarr[i] < myarr[i-1]){
				temp = myarr[i-1];
				myarr[i-1] = myarr[i];
				myarr[i] = temp;
				}
			}}
		System.out.println();
		System.out.println("Elements in ascending order: ");
		 for (int element: myarr) {
            System.out.print(element+" ");
      	  }
		}
	}