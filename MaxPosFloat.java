package com.bridgelabz.Maximum;

public class MaxPosFloat {
        public static void main(String[] args) {
            float arr[]={6.6F,2.2F,4.4F};

            System.out.println("Array elements ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");
            float max = arr[0];
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

