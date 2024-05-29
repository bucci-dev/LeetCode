import java.util.HashSet;
import java.util.Iterator;

class leetcode {
    public static void main(String[] args) {
        int[] sample = {3,3};
        //System.out.println(isAnagram("aacc", "ccac"));
        System.out.println(twoSum(sample, 6)[0]);
        System.out.println(twoSum(sample, 6)[1]);

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> storeset = new HashSet<>();

        for (Integer i : nums) {
            storeset.add(i);
        }
        if (storeset.size() < nums.length) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        HashSet<Character> storeset = new HashSet<>();
        HashSet<Character> storeset1 = new HashSet<>();


        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            storeset.add(s.charAt(i));
            storeset1.add(t.charAt(i));
        }

        Iterator<Character> iter = storeset.iterator();
        int count = 0;
        int count1 = 0;
        while (iter.hasNext()) {
            char curr = iter.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == curr) {
                    count++;
                }
                if (t.charAt(i) == curr) {
                    count1++;
                }
            }
            if (count != count1) {
                return false;
            }
            count = 0;
            count1 = 0;
        }


        if (storeset.equals(storeset1)) {
            return true;
        }

        return false;
    }


    public static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

         for (int i : set) {
             int find = target - i;

             if (set.contains(find)) {
                 int answer = 0;
                 int answer1 = 0;
                 for (int x=0; x < nums.length; x++) {
                     if (nums[x] == i) {
                         answer = x;
                     }
                 }
                 for (int x=0; x < nums.length; x++) {
                     if (nums[x] == find && x != answer) {
                         answer1 = x;
                     }
                 }

                 int[] ret_obj = {answer, answer1};
                 return ret_obj;

             }
         }

        return nums;

    }
}