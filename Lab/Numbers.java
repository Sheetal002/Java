//Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.

import java.util.Scanner;

class Numbers{

      public void calcNum(){  

      System.out.println("Numbers which divisible by 5 and greater and 40 from 1 - 100 : \n");

      for(int a = 1; a <= 100; a++)
      {
         if(a % 5 == 0)
         {
        
             if(a>40)
             {
                System.out.print(a + "\n");
             }
         }

      }

        
}

          public static void main(String args[]){
              
              Numbers obj = new Numbers();
              obj.calcNum();
}
}