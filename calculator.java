import java.util.Scanner;

// Calculator class
class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to divide two numbers (integer division)
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Input first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform operations
        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        int quotient = calculator.divide(num1, num2);

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
