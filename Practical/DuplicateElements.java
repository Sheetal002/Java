class DuplicateElements{
	
	public static void main(String args[]){
		int myarr[] = {23, 45, 45, 2, 56, 101, 2};
		for(int i =0; i< myarr.length; i++){
		for(int j = i+1; j<= myarr.length-1; j++){
			if((myarr[i] ^ myarr[j]) == 0){
				System.out.println(myarr[i] + " is at " +i +" and " +j+" position");
				}		
			}
		}	 
	}
}