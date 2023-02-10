package com.bridgelabz.Maximum;

import java.util.Scanner;

public class MaxIntValue {
    public void testMaximum(Integer x,Integer y,Integer z) {
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
        MaxFloatValue maxFloat = new MaxFloatValue();
        Integer x=3, y=10, z=15;
        maxFloat.testMaximum(x,y,z);

    }
}


