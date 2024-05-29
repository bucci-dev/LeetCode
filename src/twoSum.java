import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indice = new HashMap<>();
        for (int x=0; x < nums.length; x++) {
            indice.put(nums[x], x);
        }

        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (indice.containsKey(second)) {
                if (indice.get(second) != i) {
                    int[] ret = { i, indice.get(second) };
                    return ret;
                }
            }

        }
        return null;
    }
}
