import java.util.Stack;

public class reverseWords {
    public static void main(String args[]){
        String z = "a good   example";
        System.out.println(reverseWords(z));
    }
    public static String reverseWords(String s) {
        Stack<String> reversed = new Stack<>();
        String[] temp = new String[s.length()];
        String ret = "";
        int tindex = 0;
        for (Character c : s.toCharArray()) {
            if (c != ' ') {
                temp[tindex] += c;
            }

            if (c == ' ') {
                tindex++;
            }
        }

        for (String x : temp) {
            if (x != " ") {
                reversed.add(x);
            }
        }

        for (int x = 0; x <= reversed.size(); x++) {
            ret += reversed.removeLast();
            ret += " ";
        }
        if (!reversed.empty()) {
            ret += reversed.removeLast();
        }
        ret = ret.trim();

        return ret;
    }
}
