package week01;

import java.util.Random;

public class FindMultiples {

    // Finds a value that appears twice
    public static int findDuplicate(int[] values) {

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {

                if (values[i] == values[j]) {
                    return values[i];
                }

            }
        }

        return -1; // No duplicate found
    }

    // Finds a value that appears three times
    public static int findTriplicate(int[] values) {

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                for (int k = j + 1; k < values.length; k++) {

                    if (values[i] == values[j] && values[i] == values[k]) {
                        return values[i];
                    }

                }
            }
        }

        return -1; // No triplicate found
    }

    // Creates an array of given size and fills with random numbers
    public static int[] randomValues(int size) {

        Random rand = new Random();
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = rand.nextInt(size / 2); 
        }

        return values;
    }

    public static void main(String[] args) {

        int size = 1000;          // Change this to test different sizes
        boolean triplicates = false; // true = findTriplicate, false = findDuplicate
        boolean printArray = false;

        int[] values = randomValues(size);

        if (printArray) {
            for (int v : values) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

        long startTime = System.nanoTime();

        int result;

        if (triplicates) {
            result = findTriplicate(values);
        } else {
            result = findDuplicate(values);
        }

        long endTime = System.nanoTime();

        System.out.println("Result: " + result);
        System.out.println("Array size: " + size);
        System.out.println("Time taken (nanoseconds): " + (endTime - startTime));
    }
}
