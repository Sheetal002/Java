//Calculator using Switch case


import java.util.Scanner;

public class Calculator {

    public void operation(char operator, double num1, double num2) { 
        double result = 0; // Declaration

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is: " + num1 + " + " + num2 + " = " + result);
                break; 
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is: " + num1 + " - " + num2 + " = " + result);
                break; 

            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is: " + num1 + " * " + num2 + " = " + result);
                break; 

            case '/':
                result = num1 / num2;
                System.out.println("Division is: " + num1 + " / " + num2 + " = " + result);
                break; 

            case '%':
                result = num1 % num2;
                System.out.println("Modulus is: " + num1 + " % " + num2 + " = " + result);
                break; 

            default:
                System.out.println("INVALID OPERATOR"); 
        }
    }

    public static void main(String args[]) {
        Calculator obj = new Calculator(); 

        Scanner inpt = new Scanner(System.in); // Using Scanner For Taking Input From User

        System.out.println("Enter first number: ");
        double num1 = inpt.nextDouble(); 

        System.out.println("Enter second number: ");
        double num2 = inpt.nextDouble(); 

        System.out.println("Enter operator: +  -  *  /   %");
        char operator = inpt.next().charAt(0);

        obj.operation(operator, num1, num2); 

    }
}