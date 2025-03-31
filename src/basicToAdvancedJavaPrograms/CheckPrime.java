package basicToAdvancedJavaPrograms;

public class CheckPrime {

    CheckPrime() {
    }

    public boolean isPrime(int number) {
        boolean isPrime = true;

 /*       for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }*/

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}
