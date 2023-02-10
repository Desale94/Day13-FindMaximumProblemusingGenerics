package com.bridgelabz.Maximum;

import java.util.Scanner;

public class MaxFloatValue {
    public void testMaximum(Float x,Float y,Float z) {
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
        Float x=6.6f, y=4.4f, z=7.7f;
        maxFloat.testMaximum(x,y,z);

    }
}

