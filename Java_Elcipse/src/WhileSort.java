import java.util.Scanner;

public class WhileSort {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean flag = true;
    private static int temp;
    static int number = 3;



    public static void main(String[] args) {

        int[]value = (getInputValues(number));
        System.out.println("You input the following:");
        printArray(value);
        int[]sortedArray = compare(value);
        System.out.println("Sorted Array: ");
        printArray(sortedArray);

    }

    static int[] getInputValues(int number){
        System.out.println(" Input " + number + " numbers: \r");
        int[]input = new int[number];
        for(int i = 0; i < input.length; i++){
            input[i] = scanner.nextInt();
        }
        return input;
    }

    static void printArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    static int[] compare(int array[]){
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




}
