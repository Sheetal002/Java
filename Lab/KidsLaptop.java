//importing scanner
import java.util.Scanner;

public class KidsLaptop {   
    public static void main(String[] args) {
        //Displaying all options
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Even/Odd Number");
        System.out.println("5. Quit");
        
        //variable for scanner
        Scanner sc = new Scanner(System.in);

        //declaring variables
        int quit = 0; //flag to exit do-while loop
        int number1; //to input number of user's choice
        int number2;//to input number of user's choice
        int result;// variable to store result       
        
        do {
            System.out.println("Choose an option");
            int option = sc.nextInt(); // user enters one of the option 
        switch (option) {
           
            case 1:
                System.out.println("Enter two numbers to be added: ");
                number1 = sc.nextInt(); //user enters a number 
                number2 = sc.nextInt(); //user enters another number 
                result = number1 + number2; //sum of both numbers is stored in result variable
                System.out.println("The result is "+ result);              
                break;
            case 2:
                System.out.println("Enter two numbers to be subtracted: ");
                number1 = sc.nextInt(); //user enters a number 
                number2 = sc.nextInt(); //user enters another number 
                result = number1 - number2; //difference of both the numbers is stored in result variable
                System.out.println("The result is "+ result);
                break;
            case 3:
                System.out.println("Enter two numbers to be multiplied: ");
                number1 = sc.nextInt(); //user enters a number 
                number2 = sc.nextInt(); //user enters another number 
                result = number1 * number2; // product of both the numbers is stored in product variable
                System.out.println("The result is "+ result);
                break;
            case 4:    
                System.out.println("Enter two number to check if it is even or odd: ");
                number1 = sc.nextInt(); //user enters a number 
                if (number1%2 == 0){ // if the number modulus 2 is zero the number is even
                    String res = "Even"; 
                    System.out.println("The result is "+ res); //prints if the number is even
                }
                else{
                    String res = "Odd";
                    System.out.println("The result is "+ res);}// prints if the number is odd
                break;
            case 5: //if user's option is 5
                quit = 1; //changes the flag 

            default: //default case
                break;
        }
    }
        while (quit == 0); //checks flag condition 
        
    sc.close();
    }
}