package com.mycompany.ascii_value;

import java.util.Scanner;

public class ASCII_value {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// define input
        System.out.println("ENTER THE ASCII CODE");
        char convert = (char) input.nextInt();// user input & convert int to char

        System.out.println("THE CHARACTER IS : " + convert);
    }
}
