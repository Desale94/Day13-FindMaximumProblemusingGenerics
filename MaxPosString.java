package com.bridgelabz.Maximum;

public class MaxPosString {
    public static void main(String[] args) {
        String arr[]={"apple","peach","banana"};

        System.out.println("Array elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        String max = arr[0];
        int index=0, i;
        for (i=0;i<arr.length;i++) {
            if (arr[i].compareTo( max)>0) {
                max = arr[i];
                index=i;
            }
        }
        System.out.println("Maximum String: " +max);
        System.out.println("Position of max string is: " +index);

    }
}
