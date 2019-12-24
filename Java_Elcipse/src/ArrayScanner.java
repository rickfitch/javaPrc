import java.util.Random;
import java.util.Scanner;

public class ArrayScanner {

    private static Scanner scanner = new Scanner(System.in);
    static int number = 5;

    public static void main(String[] args) {
        int[] values = getInputValues(number);
        //int[] values = getRandomInput(number);

        for (int i = 0; i<values.length; i++){
            System.out.println("value: " + values[i]);
        }
        //AVERAGE
        System.out.println("the average of your numbers is: " + getAverage(values));

        //BUBBLE SORT
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
     static int[] getInputValues(int number){
         System.out.println("input " + number + " numbers: \r");
         int[]input =  new int[number];
         for (int i = 0; i< input.length; i++ ){
             input[i] = scanner.nextInt();
         }
         return input;
    }

    // method returns an average of values input...'double' format
    static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return (double)sum / (double)array.length;
    }

    // method swaps values if first(i) is larger than second(j)
    public static void swapValues(int[] array, int i, int j){
        if(i == j)return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // Alternate choice instead of keyboard
     static int[] getRandomInput(int number){
        int[]input = new int[number];
         Random random = new Random();
         for(int i = 0; i < number; i ++){
             input[i] = random.nextInt();
         }
         return input;
     }



}
