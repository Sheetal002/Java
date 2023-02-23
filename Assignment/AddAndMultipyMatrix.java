class AddAndMultipyMatrix{
	public static void main(String[] args){

	//declaring and initalizing operand matrices
	int[][] matrix1 = {{1,2},{3,4}};
	int[][] matrix2 = {{5,6},{7,8}};
	
	//declaring and initalizing output matrices
	int[][] product = new int[2][2];
	int[][] sum = new int[2][2];

	System.out.println("Product of the given matrices");
	for(int i=0; i<2; i++){
	for(int j=0; j<2; j++){
	product[i][j] = 0;
	for(int k=0; k<2; k++){
		product[i][j] += matrix1[i][k]*matrix2[k][j];
		}
	
	System.out.print(product[i][j]+" ");
	}
	System.out.println();
	}
	System.out.println();

	System.out.println("Sum of the given matrices");
	for(int i=0; i<2; i++){
	for(int j=0; j<2; j++){
	sum[i][j] = 0;
	for(int k=0; k<2; k++){
		sum[i][j] = matrix1[i][j]+matrix2[i][j];
		}
	
	System.out.print(sum[i][j]+" ");
	}
	System.out.println();
	}

 
	}
}