
public class CountVowelsConsonants {

    CountVowelsConsonants(){

    }

    public void countVowelsConsonants(String str){

        int vowelCount = 0;
        int consonantCount = 0;

        for(char c : str.toCharArray()){
            if("aeoiuAEOIU".indexOf(c) != -1){
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);

    }
}
