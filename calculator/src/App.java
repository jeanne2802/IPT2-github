import java.util.Scanner;

public class App {
    
    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public static int multiply(int a, int b) {
        return a * b;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Select operation: 1 - Addition, 2 - Subtraction, 3 - Multiplication, 4 - Division, 5 - Modulus");
        
        int operation = scanner.nextInt();
        
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        
        switch (operation) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Result: " + divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                try {
                    System.out.println("Result: " + modulus(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
        
        scanner.close();
    }


}