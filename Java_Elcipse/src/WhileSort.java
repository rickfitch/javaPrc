import java.util.Arrays;
import java.util.Scanner;

public class WhileSort {

    private static Scanner scanner = new Scanner(System.in);


    private static int number = 3;



    public static void main(String[] args) {

        int[]value = (getInputValues(number));
        System.out.println("You input the following:");
        printArray(value);
        System.out.println("the minimum value input is: " + findMin(value));
        int[]sortedArray = compare(value);
        System.out.println("Sorted Array: ");
        printArray(sortedArray);


    }
    //needs try catch
    private static int[] getInputValues(int number){
        System.out.println(" Input " + number + " numbers: \r");
        int[]input = new int[number];
        for(int i = 0; i < input.length; i++){
            try {
                input[i] = scanner.nextInt();
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("\n  Only integers! ... 0 replaced 'char'...\n");
            }
        }
        return input;
    }

   private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }


    private static int[] compare(int[] array){
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for( int i = 0; i < array.length - 1; i++){
                // change > to < for descending sort
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
    // finds minimum value of array
    private static int findMin(int[] array){
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }




}
