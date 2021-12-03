package com.gdstruc.module1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int variable = 0;

       while (variable < 1 || variable > 9)
       {
           System.out.println("Enter a number from 1-9 :");
           variable = scanner.nextInt();
       }
            if (variable % 3 == 0)
            {
                System.out.println("A platypus..?");
                System.out.println("Perry the Platypus!?");
            }
            else {
                System.out.println("Oh, it's just a regular platypus!");

            }
    }
}
