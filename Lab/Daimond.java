// Print Daimond pattern using for loop

import java.util.*;
import java.util.Scanner;


class Daimond
{
	
	
	static void pattern(int n)
	{
		int space = n - 1;
	
		
		for (int i = 0; i < n; i++)
		{
			
			for (int j = 0; j < space; j++)
				System.out.print(" ");
	
			
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			space--;
		}
	
		
		// reverse order
		space = 0;
	
		
		for (int i = n; i > 0; i--)
		{
			
			// before star printing
			for (int j = 0; j < space; j++)
				System.out.print(" ");
	
			// Print i stars
			for (int j = 0; j < i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			space++;
		}
	}
	
	
	public static void main(String[] args)
	{
		
 		Daimond obj = new Daimond();
		Scanner sc = new Scanner(System.in);
	
                System.out.println("Enter Number To See Pattern");
        	int n = sc.nextInt();
        	obj.pattern(n);
		
	}
}


