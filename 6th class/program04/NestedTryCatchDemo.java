//WAJP to perform nested try catch 

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        
        try {
            // Outer try block
            int arr[] = {10, 20, 30};

            try {
                // Inner try block (Arithmetic Exception)
                int result = 10 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught: " + e);
            }

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught: " + e);
        }

        System.out.println("Program continues...");
    }
}