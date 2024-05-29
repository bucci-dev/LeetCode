
public class compress {
    public static void main(String args[]){
        //char[] input = {'a','a','b','b','c','c','c'};
        char[] input = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(input));
    }

    public static int compress(char[] chars) {
        String s = "";
        s += chars[0];
        int count = 1;
        for (int x = 0; x < chars.length - 1; x++) {
            if (chars[x + 1] == chars[x]) {
                count++;
            }
            if (chars[x + 1] != chars[x]) {
                if (count > 1) {
                s += String.valueOf(count);
                }
                count = 1;
                s += chars[x + 1];
            }
        }

        if (count > 1) {
            s += String.valueOf(count);
        }

        for (int x=0; x < s.toCharArray().length; x++) {
                chars[x] = s.toCharArray()[x];
        }

        //System.out.println(chars);

        return s.length();
    }
}
