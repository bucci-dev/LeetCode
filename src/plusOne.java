public class plusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1]++;

        for (int x=digits.length-1; x >= 0; x--) {
            if (carry == 1) {
                digits[x]++;
                digits[x+1]= 0;
                carry = 0;
            }

            if (digits[x] == 10) {
                carry = 1;
                digits[x] = 0;
            }
        }

        if (carry == 1) {
            int[] ret = new int[digits.length+1];
            ret[0] = 1;

            for (int y=0; y < digits.length; y++) {
                ret[y+1] = digits[y];
            }

            return ret;
        }

        return digits;
    }
}
