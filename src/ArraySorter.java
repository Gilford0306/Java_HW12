import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nInput array length:");
            int length = scanner.nextInt();
            Random random = new Random();
            int[] originalArray = new int[length];
            for (int i = 0; i < length; i++) {
                originalArray[i] = random.nextInt(20) - 10;
            }
            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("Select the sort order (1 - ascending, 2 - descending):");
            int sortOrder = scanner.nextInt();

            if (sortOrder == 1) {
                sortAscending(originalArray);
            } else if (sortOrder == 2) {
                sortDescending(originalArray);
            } else {
                System.out.println("Incorrect selection of sort order.");
                continue;
            }
            System.out.println("Sorted array:" + Arrays.toString(originalArray));
        }while (true);
    }

    private static void sortAscending(int[] array) {
        Arrays.sort(array);
    }
    private static void sortDescending(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
    }
}
