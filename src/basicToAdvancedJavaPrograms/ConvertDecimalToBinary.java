package basicToAdvancedJavaPrograms;

import java.util.Scanner;

public class ConvertDecimalToBinary {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println(binary);
    }
}
