// 1.	Case Study: Online Food Delivery System
// A food delivery platform (like Zomato/Swiggy) processes multiple orders at the same time.
// •	Each order is handled by a separate thread 
// •	Orders take different times to prepare 
// •	Multiple orders are processed concurrently 

// Problem Statement
// Design a Java program using Multithreading where:
// •	Each order runs in a separate thread 
// •	Each thread simulates order preparation time 
// •	Display when an order starts and completes

// Concept Used
// •	Runnable interface 
// •	Thread class 
// •	start() method 
// •	sleep() for simulation 
// •	Concurrency (parallel execution)


import java.util.*;

// Order class implementing Runnable
class Order implements Runnable {
    private int orderId;
    private int preparationTime;

    // Constructor
    public Order(int orderId, int preparationTime) {
        this.orderId = orderId;
        this.preparationTime = preparationTime;
    }

    // Run method executed by thread
    @Override
    public void run() {
        try {
            System.out.println("Order " + orderId + " started preparation.");

            // Simulate preparation time
            Thread.sleep(preparationTime);

            System.out.println("Order " + orderId + " completed.");
        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " interrupted.");
        }
    }
}

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {

        // Creating orders with different preparation times
        Order order1 = new Order(1, 3000);
        Order order2 = new Order(2, 2000);
        Order order3 = new Order(3, 4000);
        Order order4 = new Order(4, 1500);

        // Creating threads
        Thread t1 = new Thread(order1);
        Thread t2 = new Thread(order2);
        Thread t3 = new Thread(order3);
        Thread t4 = new Thread(order4);

        // Starting threads (concurrent execution)
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Waiting for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All orders have been processed.");
    }
}