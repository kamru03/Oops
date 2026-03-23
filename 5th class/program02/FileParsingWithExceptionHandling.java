// 2. File Parsing with Multiple Exception Handling
// Problem Statement:
// You are given a list of strings representing file contents. Each string should contain a valid integer.
// Write a Java function that:
// •	Converts each string into an integer 
// •	Handles the following exceptions: 
// o	NumberFormatException if the string is not a valid integer 
// o	NullPointerException if the string is null 
// For each element:
// •	Print the integer if valid 
// •	Otherwise print "Invalid Input" 
// Constraints:
// •	Array size ≤ 10⁵ 
// Example:
// Input: ["10", "abc", null, "25"]

// Output:
// 10
// Invalid Input
// Invalid Input
// 25
// Concepts Used:
// Multiple catch blocks, runtime exceptions, input validation

import java.util.*;

public class FileParsingWithExceptionHandling {

    public static void parseStringToInteger(String[] fileContents) {
        for (int i = 0; i < fileContents.length; i++) {
            try {
                int num = Integer.parseInt(fileContents[i]);
                System.out.println(num);
            } catch (NullPointerException e) {
                System.out.println("Invalid Input");
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " (or 'null' for null): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("null")) {
                inputs.add(null);
            } else if (input.isEmpty()) {
                inputs.add(null);
            } else {
                inputs.add(input);
            }
        }

        System.out.println("\nParsing Results:");
        parseStringToInteger(inputs.toArray(new String[0]));

        sc.close();
    }
}
