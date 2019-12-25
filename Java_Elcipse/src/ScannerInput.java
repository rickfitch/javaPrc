import java.util.Arrays;
import java.util.Scanner;

public class ScannerInput {
    private static int count;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the size of the array:");
        count = scanner.nextInt();
        scanner.nextLine();
        int[] values = getScannerInput(count);
        System.out.println(Arrays.toString(values));

    }


    private static int[] getScannerInput(int count){

        int[]receivedInput = new int[count];
        System.out.println("input " + count + " numbers: \r");
        for(int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            scanner.nextLine(); //takes care of the 'enter key'
            receivedInput[i] = number;
        }
        return receivedInput;
    }
}
