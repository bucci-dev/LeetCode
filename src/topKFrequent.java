import java.util.*;

public class topKFrequent {
    public static void main (String args[]) {
        int nums[] = { 4,1,-1,2,-1,2,3 };
        int k = 2;
        System.out.println(topKFrequent(nums, k)[0]);
        System.out.println(topKFrequent(nums, k)[1]);




    }

    public static int[] topKFrequent(int[] nums, int k) {
        SortedSet<Integer> tset = new TreeSet<>();
        SortedMap<Integer, Integer> tmap = new TreeMap<>();

        for (Integer x : nums) {
            tset.add(x);
        }

        for (Integer x : tset) {
            int temp_count = 0;
            for (int y : nums) {
                if (x == y) {
                    temp_count++;
                }
            }

            tmap.put(temp_count, x);
        }

        int[] ret = new int[k];

        for (int x=0; x < k; x++) {
            //ret[x] = tmap.sequencedValues().toArray();
        }
        return  ret;
    }
}

