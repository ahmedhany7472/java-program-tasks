package com.mycompany.print_area_surfacearea;

import java.util.Scanner;

public class Print_area_surfacearea {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();   
        Circle c1 = new Circle();
        System.out.println("please enter the three sides of triangle in cm : ");
        System.out.print("base or side1 = ");

        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.print("side2 = ");

        Scanner input1 = new Scanner(System.in);
        double y = input1.nextDouble();
        System.out.print("side3 = ");

        Scanner input2 = new Scanner(System.in);
        double z = input2.nextDouble();
        System.out.print("height = ");

        Scanner input3 = new Scanner(System.in);
        double h = input3.nextDouble();

        t1.circumference(x, y, z, h);
        t1.Print1();
        System.out.println("______________________________________");
        System.out.println("please enter radius of circle in cm:");
        System.out.print("r = ");
        Scanner input4 = new Scanner(System.in);
        double r = input4.nextDouble();
        c1.circumference2(r);
        c1.Print2();
    }
}
