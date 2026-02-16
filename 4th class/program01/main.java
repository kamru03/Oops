import java.util.Scanner;

class Consumer {
    int consumerId;
    String consumerName;
    int unitsConsumed;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        consumerId = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        unitsConsumed = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("\n--- Consumer Details ---");
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
    }
}

class ElectricityBill extends Consumer {

    double calculateBill() {
        double bill = 0;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 1.50;
        }
        else if (unitsConsumed <= 300) {
            bill = (100 * 1.50) + ((unitsConsumed - 100) * 2.50);
        }
        else {
            bill = (100 * 1.50) + (200 * 2.50) + ((unitsConsumed - 300) * 4.00);
        }

        return bill;
    }

    void displayBill() {
        double totalBill = calculateBill();
        displayDetails();
        System.out.println("Total Bill Amount: Rs " + totalBill);
    }
}

public class main {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.getDetails();
        eb.displayBill();
    }
}
