package basicToAdvancedJavaPrograms;

public class Fibonacci {

    Fibonacci() {

    }

    public void fibonacci(int n) {
        int num1 = 0, num2 = 1;
        int count = 0;

        if (n == num1) {
            System.out.println(num1);
        } else if (n == num2) {
            System.out.println(num2);
        }

        for (int i = 2; i <= n; i++) {
            count = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + count);
            num1 = num2;
            num2 = count;
        }
    }
}
