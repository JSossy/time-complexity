package com.company;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //timed_sort(0,0);
        System.out.println(timed_sort(0,0));
        for (int i = 0; i < 9; i++) {
            System.out.println(timed_sort(50,100));
            System.out.println(timed_sort(250,1000));
            System.out.println(timed_sort(500,10000));
        }
    }

    public static int timed_sort(int n, int num_i) {
        int running_time = 0;
        int [] randomNumbers = new int[]{1};
        if (num_i == 0) {
            Scanner user = new Scanner(System.in);
            System.out.println("Please enter number.");
            int input = user.nextInt();
            System.out.println ("Please enter a second number.");
            num_i = user.nextInt();

            randomNumbers = new int[input];

            for (int i = 0; i < num_i; i++) {
                randomNumbers[i] = (int) (Math.random() * 10);
                if (i == randomNumbers.length - 2) {
                    break;
                }
            }
            long startTime = System.nanoTime();
            System.out.println(java.util.Arrays.toString(randomNumbers)); //print unsorted array
            bubbleSort(randomNumbers);
            System.out.println(java.util.Arrays.toString(bubbleSort(randomNumbers))); // print bubble sorted array
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            running_time = running_time + (int)duration;

            return running_time;
        } else {

            randomNumbers = new int[n];

            for (int i = 0; i < num_i; i++) {
                randomNumbers[i] = (int) (Math.random() * 10);
                if (i == randomNumbers.length - 2) {
                    break;
                }
            }
            long startTime = System.nanoTime();
            System.out.println(java.util.Arrays.toString(randomNumbers)); //print unsorted array
            bubbleSort(randomNumbers);
            System.out.println(java.util.Arrays.toString(bubbleSort(randomNumbers))); // print bubble sorted array
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            running_time = running_time + (int)duration;

            return running_time;
        }
    }

    public static int[] bubbleSort(int[] Array) {
        int arrayLength = Array.length - 1;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < Array.length - 1 - i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j + 1];
                    Array[j + 1] = Array[j];
                    Array[j] = temp;
                }
            }
        }

        return Array;
    }
}

