package basicToAdvancedJavaPrograms;

public class Armstrong {

    Armstrong() {
    }

    public boolean isArmstrong(int num) {

        int sum = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
