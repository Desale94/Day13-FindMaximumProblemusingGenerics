package com.bridgelabz.Maximum;

public class MaxString {
    public void testMaximum(String str1,String str2,String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        printMax(str1, str2, str3, max);
        // return max;
    }
    public static void printMax(String str1,String str2,String str3,String max) {
        System.out.printf("Max of %s,%s and %s: max is %s \n", str1, str2, str3, max);
    }
    public static void main(String[] args) {
        MaxString maxString = new MaxString();
        String str1="apple", str2="peach", str3="banana";
        maxString.testMaximum(str1,str2,str3);

    }
}

