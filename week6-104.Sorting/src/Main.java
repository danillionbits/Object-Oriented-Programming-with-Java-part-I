
import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int buffer = array[0];
        for (int i : array) {
            if (i < buffer) {
                buffer = i;
            }
        }
        return buffer;
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int buffer = array[index], buffer1 = index;
        for (int i = index; i < array.length; i++) {
            if (buffer > array[i]) {
                buffer = array[i];
                buffer1 = i;
            }
        }
        return buffer1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int buffer = 0;
        buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

}
