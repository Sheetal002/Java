public class RemoveDuplicate {
	static int temp;
	public static void main(String[] args){
		int[] myarr = {23, 11, 45, 2, 56, 11, 101,2}; //static array
		for(int i =0; i< myarr.length;i++){
			for(int j = i+1; j<= myarr.length-1; j++){
		if((myarr[i] ^ myarr[j]) == 0){
			//System.out.print(myarr[i]+" "+myarr[j]+" ");
			myarr[i]=0;
			i++;
		}		
	}
 }
	for (int element: myarr) {
      System.out.print(element+" ");
      	  }
	}
}