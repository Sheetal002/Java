// Print even, odd, sum of natural number using for loop from 1-200

import java.util.Scanner;

class ForLoop{

      public void calcNum(){

        System.out.println("Even numbers from 1 to 200 are: \n");         

         for(int a = 1; a <= 200; a++)
         {
         if(a % 2 == 0)
         {
            System.out.print(a + "\n");
         }
         }
      

      System.out.println("Odd numbers from 1 to 200 are: \n");
      for(int a = 1; a <= 200; a++)
      {
         if(a % 2 == 1)
         {
            System.out.print(a + "\n");
         }
      }
      
      int sum=0;
      for(int a = 1; a <= 200; a++)
      {

                 sum = sum + a;
                          
 
      }
      
      System.out.println("Sum of Natural Numbers from 1-200 is = " + sum);  
}



          public static void main(String args[]){
              
              ForLoop fe = new ForLoop();
              fe.calcNum();
}
}