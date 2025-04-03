
public class PrimeInRange {

    public static void main(String[] args) {

        int start = 10, end = 50;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && num > 1) {
                System.out.print(num + ", ");
            }
        }
    }
}
