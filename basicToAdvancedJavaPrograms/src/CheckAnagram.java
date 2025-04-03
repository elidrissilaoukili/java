
import java.util.Arrays;

public class CheckAnagram {

    CheckAnagram(){}

    public boolean isAnagram(String str1, String str2) {

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);
    }
}
