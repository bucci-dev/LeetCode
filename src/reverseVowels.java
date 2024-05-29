import java.util.ArrayList;
import java.util.List;

public class reverseVowels {
    public String reverseVowels(String s) {
        String ret = "";
        List<Character> vowels = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels.add(c);
            }
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                ret += vowels.reversed().get(count);
                count ++;
            }

            else {
                ret += c;
            }
        }

        return ret;
    }
}
