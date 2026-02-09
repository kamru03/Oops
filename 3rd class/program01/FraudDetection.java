import java.util.Scanner;

public class FraudDetection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        boolean found = false;

        // two-sum logic
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No valid pair found");
        }

        sc.close();
    }
}
