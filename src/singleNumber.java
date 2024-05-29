public class singleNumber {
    public int singleNumber(int[] nums) {
        int temp = 0;

        for (int x : nums){
            temp = temp ^ x;
        }

        return temp;
    }
}
