
public class FindMissingNumber {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 6};

        int length = array.length + 1;

        int total = length * (length + 1) / 2;
        for (int number : array) {
            total -= number;
        }

        int missingNumber = total;
        System.out.println(missingNumber);
    }
}
