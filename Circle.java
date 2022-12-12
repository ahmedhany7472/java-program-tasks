package com.mycompany.print_area_surfacearea;

public class Circle {

    double area2;
    double circumference2;
    // set Ripss values
    public void circumference2(double r) {
        circumference2 = (2 * 3.14 * r);
        area2 = area2(r);
    }
    // ret area value
    public double area2(double r) {
        area2 = (3.14 * r * r);
        return area2;
    }
    // get circumference value
    void Print2() {
        System.out.println("Area of circule = " + area2 + " cm^2");
        System.out.println("circumference of circule = " + circumference2 + " cm");

    }

}
