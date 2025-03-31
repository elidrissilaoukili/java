package basicToAdvancedJavaPrograms;

public class FindLargestNumbers {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 3, 99, 45, 165, 46};

        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = Integer.MIN_VALUE;

        for(int number : array) {
            if(number > firstNumber) {
                secondNumber = firstNumber;
                firstNumber = number;
            }
            if(number > secondNumber && number != firstNumber) {
                secondNumber = number;
            }
        }
        System.out.println(firstNumber);
        System.out.println(secondNumber);

    }
}
