
public class ReverseNumber {
    public static void main(String[] args) {

        int number = 12345;
        int temp = 12345;
        int reversedNumber = 0;

        while (temp != 0) {
            int mod = temp % 10;
            reversedNumber = reversedNumber * 10 + mod;
            temp = temp / 10;
        }

        System.out.println(reversedNumber);
    }
}
