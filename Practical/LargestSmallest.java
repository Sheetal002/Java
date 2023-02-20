public class LargestSmallest{
	
	
public static void main(String args[]){
	int myarr[] = {23, 45, 56, 101, 2};
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
	System.out.println("Smallest: "+smallest);
	System.out.print("Largest: "+largest);
	}



}