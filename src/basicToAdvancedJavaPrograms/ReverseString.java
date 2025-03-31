package basicToAdvancedJavaPrograms;

public class ReverseString {

    private String word;

    ReverseString(String word) {
        this.word = word;
    }

    public void reverse() {
        StringBuilder reversed = new StringBuilder(this.word);
        reversed.reverse();
        System.out.println(reversed);
    }
}
