public class countSegments {
    public int countSegments(String s) {
        int ret = 0;
        s = s.trim();

        if (!s.isEmpty()) {
            if (s.toCharArray()[0] != ' ') {
                ret++;
            }
        }

        boolean segment = false;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                segment = true;
            }
            if (segment && c != ' ') {
                ret++;
                segment = false;
            }
        }

        return ret;
    }
}
