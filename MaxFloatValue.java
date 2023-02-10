package com.bridgelabz.Maximum;

import java.util.Scanner;

public class MaxFloatValue {
    public static void testMaximum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 Float number: ");
        Float x = s.nextFloat();
        Float y = s.nextFloat();
        Float z = s.nextFloat();
        Float max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        // return max;
    }
    public static void printMax(float x, float y, float z, float max) {
        System.out.printf("Max of %s,%s and %s: max is %s \n", x, y, z, max);
    }
    public static void main(String[] args) {
        MaxFloatValue maxFloat = new MaxFloatValue();
        maxFloat.testMaximum();

    }
}

