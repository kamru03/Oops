// 2.	Case Study: Hospital Emergency System
// In a hospital:
// •	Patients are treated based on priority 
// •	Emergency cases get higher priority 
// •	Normal cases get lower priority 

// Problem Statement
// Write a Java program where:
// •	Each patient is a thread 
// •	Assign different priorities to patients 
// •	Display priority using getPriority() 
// •	Observe execution behavior

// Sample Output
// Priority of p1: 1
// Priority of p2: 5
// Priority of p3: 10

// Emergency Patient is being treated | Priority: 10
// Serious Patient is being treated | Priority: 5
// Normal Patient is being treated | Priority: 1


// Key Concepts
// •	setPriority(int) → sets priority (1 to 10) 
// •	getPriority() → gets priority 
// •	MIN_PRIORITY = 1 
// •	NORM_PRIORITY = 5 
// •	MAX_PRIORITY = 10


// Patient class extending Thread
class Patient extends Thread {
    private String patientType;

    // Constructor
    public Patient(String patientType) {
        this.patientType = patientType;
    }

    // Run method
    @Override
    public void run() {
        System.out.println(patientType + " Patient is being treated | Priority: " + this.getPriority());
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {

        // Creating patient threads
        Patient p1 = new Patient("Normal");
        Patient p2 = new Patient("Serious");
        Patient p3 = new Patient("Emergency");

        // Setting priorities
        p1.setPriority(Thread.MIN_PRIORITY);   // 1
        p2.setPriority(Thread.NORM_PRIORITY);  // 5
        p3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Display priorities
        System.out.println("Priority of p1: " + p1.getPriority());
        System.out.println("Priority of p2: " + p2.getPriority());
        System.out.println("Priority of p3: " + p3.getPriority());

        // Starting threads
        p1.start();
        p2.start();
        p3.start();
    }
}