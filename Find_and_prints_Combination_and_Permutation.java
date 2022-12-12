package com.mycompany.find_and_prints_combination_and_permutation;

import java.util.Scanner;

public class Find_and_prints_Combination_and_Permutation {

    public static void main(String[] args) {

        int nCr, nPr; // define variables
        System.out.println("please enter two number x AND y :");
        Scanner input = new Scanner(System.in); //---------------
        int x = input.nextInt();                //user input vars
        int y = input.nextInt();                //---------------
        int z = 1;
        // cala factorial_1
        for (int i = 1; i <= x; i++) {
            z = z * i;
        }
        // cala factorial_2
        int w = 1;
        for (int i = 1; i <= (x - y); i++) {
            w = w * i;
        }
        // cala factorial_3
        int c = 1;
        for (int i = 1; i <= (y); i++) {
            c = c * i;
        }
        nCr = z / (w * c);
        nPr = z / w;
        System.out.println("THE VALUE OF (nCr)Combination IS : " + nCr);
        System.out.println("THE VALUE OF (nPr)Permutation IS : " + nPr);
        System.out.println("END OF PROCESS");
    }
}
