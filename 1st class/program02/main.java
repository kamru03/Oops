//WAJP to calculate volume of cube, cuboid and cylinder giving user input and using two classes.

import java.util.Scanner;

class Volume {
    double cube(double side) {
        return side * side * side;
    }

    double cuboid(double length, double breadth, double height) {
        return length * breadth * height;
    }

    double cylinder(double radius, double height) {
        return 3.14 * radius * radius * height;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        // Cube
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube = " + v.cube(side));

        // Cuboid
        System.out.print("Enter length of cuboid: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of cuboid: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of cuboid: ");
        double h = sc.nextDouble();
        System.out.println("Volume of Cuboid = " + v.cuboid(l, b, h));

        // Cylinder
        System.out.print("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double hc = sc.nextDouble();
        System.out.println("Volume of Cylinder = " + v.cylinder(r, hc));

        sc.close();
    }
}
