public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int position0 = 0;
        boolean swapping = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                position0 = i;
                swapping = true;
            }

            if (nums[i] != 0 && swapping) {
                nums[position0] = nums[i];
                nums[i] = 0;
            }


        }
    }
}
