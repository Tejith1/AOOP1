import java.util.Arrays;

// Define a generic interface
interface MinMax<T extends Comparable<T>> {
    T getMax(T[] array);
    T getMin(T[] array);
}

// Implement the interface for different data types
class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    @Override
    public T getMax(T[] array) {
        return Arrays.stream(array).max(Comparable::compareTo).orElse(null);
    }

    @Override
    public T getMin(T[] array) {
        return Arrays.stream(array).min(Comparable::compareTo).orElse(null);
    }
}

public class GenericMinMax {
    public static void main(String[] args) {
        // Test with Integer
        Integer[] intArray = {3, 5, 1, 8, 2};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Max: " + intMinMax.getMax(intArray));
        System.out.println("Integer Min: " + intMinMax.getMin(intArray));

        // Test with String
        String[] strArray = {"apple", "orange", "banana", "grape"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Max: " + strMinMax.getMax(strArray));
        System.out.println("String Min: " + strMinMax.getMin(strArray));

        // Test with Character
        Character[] charArray = {'d', 'a', 'c', 'b'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Max: " + charMinMax.getMax(charArray));
        System.out.println("Character Min: " + charMinMax.getMin(charArray));

        // Test with Float
        Float[] floatArray = {3.5f, 2.1f, 5.7f, 1.9f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Max: " + floatMinMax.getMax(floatArray));
        System.out.println("Float Min: " + floatMinMax.getMin(floatArray));
    }
}
