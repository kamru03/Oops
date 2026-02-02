import java.util.*;

class Student{
    int rollNo;
    String stuName;
    double marks;

    static String collegeName = "Adamas University";

    Student (int rollNo, String stuName, double marks){
        this.rollNo = rollNo;
        this.stuName = stuName;
        this.marks = marks;
    }

    static void displayCollegeName(){
        System.out.println("College Name :"+ collegeName);
    }

    void displayInfo(int rollNo, String stuName){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Student Name: " + stuName);
    }

    void displayInfo(int rollNo, String stuName, double marks){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Student Name: " + stuName);
        System.out.println("Marks: " + marks);
    }
}

class Authentication{
    static String correctUsername = "admin";
    static String correctPassword = "password123";

    void login(String username){
       if(username.equals(correctUsername)){
           System.out.println("Username is correct.");
       } else {
           System.out.println("Incorrect username.");
       }
    }

    void login(String username, String password){
        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }
}

public class CollegeApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student class demonstration
        Student.displayCollegeName();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String stuName = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(rollNo, stuName, marks);
        System.out.println("\nDisplaying Student Info (Roll No and Name):");
        student.displayInfo(rollNo, stuName);

        System.out.println("\nDisplaying Student Info (Roll No, Name and Marks):");
        student.displayInfo(rollNo, stuName, marks);

        // Authentication class demonstration
        Authentication auth = new Authentication();

        System.out.print("\nEnter Username for login: ");
        String username = sc.next();
        auth.login(username);

        System.out.print("Enter Username for login: ");
        username = sc.next();
        System.out.print("Enter Password for login: ");
        String password = sc.next();
        auth.login(username, password);

        sc.close();
    }
}