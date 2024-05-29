public class mergeAlternately {

    public String mergeAlternately(String word1, String word2) {
        int end = 0;
        int same_size = 0;
        String end_char = "";
        String result = "";
        if (word1.length() > word2.length()) {
            end = word1.length() - word2.length();
            same_size = word2.length();
            end_char = word1.substring(word2.length());
        }

        else if (word1.length() < word2.length()){
            end = word2.length() - word1.length();
            same_size = word1.length();
            end_char = word2.substring(word1.length());
        }

        else if (word1.length() == word2.length()){
            same_size = word2.length();
            end = 0;
        }

        for (int x=0; x < same_size; x++) {
            result += word1.charAt(x);
            result += word2.charAt(x);
        }
        result += end_char;

        return result;
    }
}
