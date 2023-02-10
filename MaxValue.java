package com.bridgelabz.Maximum;
public class MaxValue<T extends Comparable <T>> {
    T x, y, z;

    public MaxValue(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        return MaxValue.maximum(x, y, z);
    }

    public static Integer testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static Float testMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s,%s and %s: max is %s \n", x, y, z, max);
    }

    public static void main(String[] args) {
        Integer xInt=3, yInt=4, zInt=5;
        Float xFl=6.6f, yFl=4.4f, zFl=7.7f;
        String xStr="apple", yStr="peach", zStr="banana";
        MaxValue.testMaximum(xInt,yInt,zInt);
        MaxValue.testMaximum(xFl,yFl,zFl);
        MaxValue.testMaximum(xStr, yStr,zStr);

    }
}
