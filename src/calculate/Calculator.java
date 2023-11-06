package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main
 */
public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
    }

    public void division(int a, int b) {//Division instance method with print statement
        try { // try block will execute if user has entered int 2 as 0 for division
            System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        } catch (ArithmeticException e) { // catch block will execute when exception happens printing the error message
            System.out.println("*** PROBLEM WITH YOUR SELECTION : DIVISION BY 0 IS MATHEMATICALLY NOT ALLOWED ***");
        }
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else {
            System.out.println("Invalid Symbol");
        }

    }
}
