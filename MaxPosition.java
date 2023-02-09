package com.bridgelabz.Maximum;

import java.util.Scanner;

public class MaxPosition {
    public static void main(String[] args) {
        int arr[]={23,10,15};

        System.out.println("Array elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int max = arr[0];
        int index=0, i;
        for (i=0;i<arr.length;i++) {
            if (arr[i]> max) {
                max = arr[i];
                index=i;
            }
        }
        System.out.println("Maximum Integer value: " +max);
        System.out.println("Position of max Integer number is: " +index);

    }
}


