import java.util.PriorityQueue;

public class firstMissingPositive {
    public static void main(String args[]) {
        int[] nums = { -1,4,2,1,9,10 };   // output of 5, expected 3
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        PriorityQueue<Integer> retqueue = new PriorityQueue<>();


        for (int x : nums) {
            if (x > 0) {
                pqueue.add(x);
            }
        }

        if (pqueue.peek() != null) {
            for (int x=1; x < pqueue.peek(); x++) {
                retqueue.add(x);
                if (!retqueue.isEmpty()) {
                    return retqueue.peek();
                }
            }
        }



        for (int x : pqueue) {
            if (!pqueue.contains(x + 1) && (x + 1) > 0) {
                retqueue.add(x + 1);
                if (!retqueue.isEmpty()) {
                    return retqueue.peek();
                }
            }
        }

        return 1;
    }
}
