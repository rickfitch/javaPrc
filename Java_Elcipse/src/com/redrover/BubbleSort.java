package com.redrover;

import java.util.Scanner;

    /* Ascending Bubble Sort Takes five numbers from keyboard or random numbers.
    Bubble sort is 'On squared' (quadratic). It is also considered sorted. Unsorted usually has >= for ascending...
    */

public class BubbleSort {


    static int number = 5;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getInputValues(number);


        //BUBBLE SORT ascending / for descending change if statement to < ...
        for(int lastUnsortedIndex = values.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if (values[i] > values[i + 1]){
                    swapValues(values,i, i+1);
                }
            }
        }
        //PRINT SORTED
        for (int i = 0; i<values.length; i++){
            System.out.println("value: " + values[i]);
        }
    }

    // method getInputValues return an array of integers input from keyboard

    static int[] getInputValues(int number) {
        System.out.println("input " + number + " numbers: \r");
        int[] input = new int[number];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        return input;
    }


    // method swaps values if first(i) is larger than second(j)
    public static void swapValues(int[] array, int i, int j){
        if(i == j)return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
