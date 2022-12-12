package com.mycompany.d_array;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//input define
        Scanner n = new Scanner(System.in);//input define
        System.out.println("enter number of elements in array");//output statment
        int x = input.nextInt();//input number
        double[] num_Array = new double[x];//array define
        System.out.println("enter the element");//output statment
        //input the element
        for (int i = 0; i < num_Array.length; i++) {
            System.out.print("element " + (i + 1) + ": ");
            num_Array[i] = n.nextDouble();

        }
        //output the array
        System.out.print("THE FINAL ARRAY IS :" + "(");
        for (int i = 0; i < num_Array.length; i++) {
            System.out.print(num_Array[i] + " , ");
            if (i == (x - 2)) {
                System.out.println(num_Array[x - 1] + ")");
                break;
            }
        }
        //test the elements to choose the largest 
        double largest = num_Array[0];
        for (double num : num_Array) {
            if (largest < num) {
                largest = num;
            }
        }
        System.out.format("Largest element = %.2f", largest);

    }
}
