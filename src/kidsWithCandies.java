import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ret = new ArrayList<>();

        SortedSet<Integer> largest = new TreeSet<>();

        for (int x : candies) {
            largest.add(x);
        }

        for (int x: candies) {
            if (x + extraCandies >= largest.last()) {
                ret.add(true);
            }
            else {
                ret.add(false);
            }
        }

        return ret;
    }
}
