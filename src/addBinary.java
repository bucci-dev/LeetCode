import static java.lang.Math.pow;

public class addBinary {
    public String addBinary(String a, String b) {
        long curr;
        long a_total = 0;
        long b_total = 0;

        for (int x=0; x < a.length(); x++) {
            curr = (long)pow(2, a.length()-(x+1));

            if (a.charAt(x) == '1') {
                a_total += curr;
            }
        }

        for (int x=0; x < b.length(); x++) {
            curr = (long)pow(2, b.length()-(x+1));

            if (b.charAt(x) == '1') {
                b_total += curr;
            }
        }

        String ret = .toBinaryString(a_total + b_total);

        return ret;
    }
}
