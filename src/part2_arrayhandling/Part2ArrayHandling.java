package part2_arrayhandling;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part2ArrayHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // for 2.1
        System.out.println("Enter array length");
        int length = in.nextInt();
        in.nextLine();

        int[] array = inputArray(length, in);
        // for 2.3
        printArray(array);
        // for 2.4
        int sum = sumArray(array);
        System.out.println();
        System.out.println("Sum of elements is " + sum);
        // for 2.5
        System.out.println("Enter random array length:");
        int randomLength = in.nextInt();

        int[] random = randomArray(randomLength);

        System.out.println("Random array:");
        printArray(random);

        int max = maxArrayInt(random);
        System.out.println();
        System.out.println("Largest value is " + max);
        // for 2.6
        System.out.println("What value would you like to find?");
        int value = in.nextInt();
        int SearchArray = searchArray(array, value);
        System.out.println("Position of value " + value + " is " + SearchArray);
    }
    // Part 2.1 Input Method
    public static int[] inputArray(int length, Scanner in) {

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + i + ":");
            array[i] = in.nextInt();
        }

        return array;
    }
    // Part 2.2 Random values array
    public static int[] randomArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * length);
        }
        return array;
    }
    // Part 2.3 Print Array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    // Print 2.4 Sum of elements
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    // Print 2.5 Largest value
    public static int maxArrayInt(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    // Print 2.6 Search value
    public static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}