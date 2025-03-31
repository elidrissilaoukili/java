package basicToAdvancedJavaPrograms;

public class FindLargest {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 3, 99, 45, 165, 46};

        int largest = array[0]; // 1

        for (int number : array) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println(largest);

    }
}
