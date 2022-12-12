package com.mycompany.remove_all_coma;

import java.util.Scanner;

public class Remove_all_coma {

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE STATMENT :");
        System.out.println("");
        Scanner input = new Scanner(System.in);//input define
        String line = input.nextLine();//enter input
        System.out.println("");
        line = line.toLowerCase();//convert all statment to small character
        String new_statment = "";//empty variable
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            // check if character has coma (,) remove it 

            if (ch != ',') {
                new_statment = new_statment + ch;

            }

        }
        System.out.println("THE NEW STATMENT WITHOUT COMA (,) IS : ");
        System.out.println("");
        System.out.println(new_statment);

    }
}
