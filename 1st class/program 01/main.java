//WAJP to perform addition, substraction, multiplication and division using 2 classes.

import java.util.Scanner;

class Arithmetic {
    int a, b;

    void setValues(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int subtract() {
        return a - b;
    }

    int multiply() {
        return a * b;
    }

    double divide() {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return (double) a / b;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Arithmetic obj = new Arithmetic();
        obj.setValues(x, y);

        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.subtract());
        System.out.println("Multiplication: " + obj.multiply());
        System.out.println("Division: " + obj.divide());

        sc.close();
    }
}
