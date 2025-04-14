package com.grettastic;

import com.grettastic.processors.ArrayProcessor;
import com.grettastic.processors.NameProcessor;
import com.grettastic.processors.NumberProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = scanner.nextInt();
        NumberProcessor.checkNumber(num);


        System.out.println("Enter the name");
        String name = scanner.next();
        NameProcessor.checkName(name);

        System.out.println("Enter the array size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %s element of an array \n", i+1);
            arr[i] = scanner.nextInt();
        }

        System.out.println("Numbers divisible by 3:");
        ArrayProcessor.printDivisibleByThree(arr);

        scanner.close();
    }
}