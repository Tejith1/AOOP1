import java.util.Arrays;

public class GenericBubbleSort {
    
    // Generic bubble sort method
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {5, 3, 8, 1, 2};
        bubbleSort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        // Test with Double array
        Double[] doubleArray = {3.5, 2.1, 5.7, 1.9};
        bubbleSort(doubleArray);
        System.out.println("Sorted Double Array: " + Arrays.toString(doubleArray));

        // Test with String array
        String[] strArray = {"banana", "apple", "orange", "grape"};
        bubbleSort(strArray);
        System.out.println("Sorted String Array: " + Arrays.toString(strArray));
    }
}
