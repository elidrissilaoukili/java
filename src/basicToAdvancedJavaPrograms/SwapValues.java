package basicToAdvancedJavaPrograms;

public class SwapValues {

    public static void main(String[] args) {

        String a = "firstName";
        String b = "lastName";
        String temp;

        System.out.println("Before Swapping:");
        System.out.println(a + " " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println(a + " " + b);
    }
}
