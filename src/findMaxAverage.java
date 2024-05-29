import java.util.ArrayList;

// rewrite to make faster
public class findMaxAverage {
    public static void main(String args[]) {
        int[] nums = {-1};
        int k = 1;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        ArrayList<Integer> window = new ArrayList<>(k);

        double highest = 0;
        double curr = 0;

        for (int i : nums) {
            if (window.size() < k) {

                curr += i;
                window.add(i);

                highest = curr;

            }
            else {
                curr += i;
                window.add(i);
                curr -= window.getFirst();
                window.removeFirst();

                if (curr > highest) {
                    highest = curr;
                }

            }
        }

        return highest/k;
    }
}
