
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 5, 10, 5, 6, 8, 7, 7, 8, 9, 10};

        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        System.out.println(set);
    }
}

