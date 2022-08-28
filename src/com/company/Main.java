package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int  i = 0; i < testCase; i++){
            int weeks = scan.nextInt();
            int cost = scan.nextInt();

            System.out.println(weeks * cost);


        }
    }
}
