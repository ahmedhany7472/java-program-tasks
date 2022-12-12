package com.mycompany.print_area_surfacearea;

public class Triangle {

    double area1;
    double circumference1;

    // set Rips value
    public void circumference(double x, double y, double z, double h) {
        circumference1 = x + y + z;
        area1 = area(x, h);
    }
    // get area value
    public double area(double x, double h) {
        area1 = 0.5 * (x * h);
        return area1;
    }
    // get circumference value
    void Print1() {
        System.out.println("Area of triangle = " + area1 + " cm^2");
        System.out.println("circumference of triangle = " + circumference1 + " cm");

    }

}
