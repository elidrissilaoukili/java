
import java.util.Arrays;

public class SortArray {

    SortArray(){}

    public void sortArray(int[] array) {

        System.out.println("Before sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        Arrays.sort(array);

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
