import java.util.Scanner;

class Person {
    int personId;
    String personName;

    void getPersonDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person ID: ");
        personId = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Person Name: ");
        personName = sc.nextLine();
    }

    void displayPersonDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Person ID: " + personId);
        System.out.println("Person Name: " + personName);
    }
}

class Employee extends Person {
    double basicSalary;

    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
}

class Salary extends Employee {

    double calculateSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double totalSalary = basicSalary + hra + da;
        return totalSalary;
    }

    void displaySalary() {
        displayPersonDetails();
        double total = calculateSalary();
        System.out.println("Basic Salary: Rs " + basicSalary);
        System.out.println("HRA (20%): Rs " + (0.20 * basicSalary));
        System.out.println("DA (10%): Rs " + (0.10 * basicSalary));
        System.out.println("Total Salary: Rs " + total);
    }
}

public class main {
    public static void main(String[] args) {
        Salary s = new Salary();

        s.getPersonDetails();
        s.getEmployeeDetails();
        s.displaySalary();
    }
}
