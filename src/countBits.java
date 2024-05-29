public class countBits {
    public int[] countBits(int n) {
        int count = 0;
        int[] ret = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            int temp = i;
            while (temp > 0) {
                count += temp & 1;
                temp = temp >> 1;
            }
            ret[i] = count;
            count = 0;
        }

        return ret;
    }
}
