package by.viachaslau;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums));


    }

   public boolean canJump(int[] nums) {
        int target = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (target <= i + nums[i]) {
                target = i;
            }
        }
        if (target == 0)
            return true;
        return false;
    }
}
