import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> unique = new HashMap<>();
        Set<Integer> ret_values = new HashSet<>();


        for (int x : arr) {

            if (unique.containsKey(x)) {
                unique.put(x, unique.get(x) + 1);
            }
            else {
                unique.put(x, 1);
            }
        }

        for (int x : unique.values()) {
            ret_values.add(x);
        }

        if (ret_values.size() == unique.size()) {
            return true;
        }

        return false;

    }
}
