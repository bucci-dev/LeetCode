import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> ret1 = new ArrayList<>();
        List<Integer> ret2 = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();

        Set<Integer> numset1 = new HashSet<>();
        Set<Integer> numset2 = new HashSet<>();

        for (int x: nums1) {
            numset1.add(x);
        }
        for (int x: nums2) {
            numset2.add(x);
        }

        for (int x: numset1) {
            if (!numset2.contains(x)) {
                ret1.add(x);
            }
        }
        for (int x: numset2) {
            if (!numset1.contains(x)) {
                ret2.add(x);
            }
        }

        ret.add(ret1);
        ret.add(ret2);

        return ret;
    }
}
