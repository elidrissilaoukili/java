package basicToAdvancedJavaPrograms;

import java.util.Arrays;

public class MergeAarrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 3, 5};
        int[] array2 = {6, 7, 9, 8, 10};

        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 5, array1.length);
        System.arraycopy(array2, 0, mergedArray, 0, array2.length);

        Arrays.sort(mergedArray);
        System.out.print(Arrays.toString(mergedArray));
    }
}
