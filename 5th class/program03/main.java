// 3. Nested Try-Catch with Finally Block
// Problem Statement:
// Write a Java program that processes a list of integer pairs (a, b) and performs division a / b.
// Requirements:
// •	Use nested try-catch blocks: 
// o	Inner block handles ArithmeticException (division by zero) 
// o	Outer block handles any other unexpected exceptions 
// •	A finally block must print "Operation Attempted" after each division attempt 
// For each pair:
// •	Print the result if valid 
// •	Print "Division by Zero" if b == 0 
// •	Print "Error Occurred" for any other exception 
// Constraints:
// •	Number of pairs ≤ 10⁴ 
// Example:
// Input: [(10,2), (5,0), (8,4)]

// Output:
// 5
// Operation Attempted
// Division by Zero
// Operation Attempted
// 2
// Operation Attempted
// Concepts Used:
// Nested try-catch, finally, exception hierarchy

import java.util.*;

public class main {

    public static void divide(int a, int b) {
        try {
            try {
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Division by Zero");
            }
        } catch (Exception e) {
            System.out.println("Error Occurred");
        } finally {
            System.out.println("Operation Attempted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nPair " + (i + 1));

            System.out.print("Enter first number (a): ");
            int a = sc.nextInt();

            System.out.print("Enter second number (b): ");
            int b = sc.nextInt();

            divide(a, b);
        }

        sc.close();
    }
}
