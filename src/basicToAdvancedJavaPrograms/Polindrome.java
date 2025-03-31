package basicToAdvancedJavaPrograms;

public class Polindrome {

    private String word;

    Polindrome() {
    }

    Polindrome(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public void checkPolindrome() {
        StringBuilder str = new StringBuilder(getWord());
        String reversedStr = str.reverse().toString();

        if (reversedStr.equals(this.word)) {
            System.out.println(getWord() + " is a polindrome");
        } else {
            System.out.println(getWord() + " is not a polindrome");
        }
    }
}