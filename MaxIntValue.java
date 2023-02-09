package com.bridgelabz.Maximum;

import java.util.Scanner;

public class MaxIntValue {
    public static void testMaximum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 integer number: ");
        Integer x = s.nextInt();
        Integer y = s.nextInt();
        Integer z = s.nextInt();
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
    }
    public static void printMax(int x, int y, int z, int max) {
        System.out.printf("Max of %s,%s and %s: max is %s \n", x, y, z, max);
    }
    public static void main(String[] args) {
        MaxIntValue maxIntValue = new MaxIntValue();
        maxIntValue.testMaximum();

    }
}


