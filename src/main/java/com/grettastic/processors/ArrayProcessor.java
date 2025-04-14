package com.grettastic.processors;

public class ArrayProcessor {

    public static void printDivisibleByThree(int[] arr) {
        for (int a : arr) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}
