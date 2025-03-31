package basicToAdvancedJavaPrograms;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter str1: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter str2: ");
            String str2 = scanner.nextLine();

            CheckAnagram anagram = new CheckAnagram();

            if (anagram.isAnagram(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            } else {
                System.out.println(str1 + " and " + str2 + " are NOT anagram");
            }
        }

    }
}
