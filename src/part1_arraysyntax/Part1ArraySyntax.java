package part1_arraysyntax;

public class Part1ArraySyntax {
    public static void main(String[] args) {
        // Part 1.1 Array creation
        int[] predefined = new int[10];
        int size = 15;
        int[] definedsize = new int[size];
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] integers = {1, 2, 3, 4, 5};
        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        String[] words = {"GPU", "Keyboard", "Motherboard"};
        char[] letters = {'A', 'B', 'C'};
        boolean[] booleans = {true, false};

        System.out.println(predefined.length);
        System.out.println(definedsize.length);
        System.out.println(arr.length);
        System.out.println(integers.length);
        System.out.println(doubles.length);
        System.out.println(words.length);
        System.out.println(letters.length);
        System.out.println(booleans.length);
        // Part 1.2 Access array elements by index
        int[] a = new int[6];
        a[4] = 45;
        System.out.println("5th element of array: " + a[4]);
        // System.out.println("This should call an error: " + a[1000]);
        // Part 1.3 Array traversal
        int[] forarray = {1200, 4, 5, 8, 9, 6, 14, 24, 61, 15};
        for (int i = 0; i < forarray.length; i++) {
            System.out.println(forarray[i] + " ");
        }
        for (int value : forarray) {
            System.out.print(value + " ");
        }
        System.out.println();
        int i = 0;
        while (i < forarray.length) {
            System.out.print(forarray[i] + " ");
            i++;
        }
    }
}