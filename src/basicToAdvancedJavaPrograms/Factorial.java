package basicToAdvancedJavaPrograms;

public class Factorial {

    Factorial() {
    }


    public void factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println(fact);
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("the factorial of " + n + " is " + fact);
        }
    }
}
