package com.mycompany.transpose_2d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose_2d_array {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);//input define
        Scanner input2 = new Scanner(System.in);//input define
        Scanner input3 = new Scanner(System.in);//input define
        System.out.println("enter number of rows");//output statment
        int r = input1.nextInt();//input number
        System.out.println("enter number of coulms");//output statment
        int c = input2.nextInt();//input number
        double[][] num_Array = new double[r][c];//array define
//input the elements in array
        for (int i = 0; i < r; i++) {
            System.out.println("enter the element in ROW " + (i + 1) + " : ");
            for (int k = 0; k < c; k++) {
                num_Array[i][k] = input3.nextDouble();

            }
        }

//output the array
        System.out.println("THE FINAL ARRAY IS :");
        System.out.println("{");
        for (int i = 0; i < r; i++) {
            System.out.print("(");
            for (int k = 0; k < c; k++) {
                System.out.print(num_Array[i][k] + " , ");
                if (k == (c - 2)) {
                    System.out.println(num_Array[i][c - 1] + ")");
                    break;
                }
            }
        }
        System.out.println("}");

        //transpose the array
        System.out.println("THE TRANSPOSE ARRAY IS :");
        System.out.println("{");
        for (int i = 0; i < r; i++) {
            System.out.print("(");
            for (int k = 0; k < c; k++) {
                System.out.print(num_Array[k][i] + " , ");
                if (k == (c - 2)) {
                    System.out.println(num_Array[c - 1][i] + ")");
                    break;
                }
            }
        }
        System.out.println("}");
Arrays.sort(num_Array);
    }

}
