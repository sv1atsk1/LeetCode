package by.viachaslau;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(solution.jump(nums));


    }

    public int jump(int[] nums) {
        int totalJumps = 0, coverage = 0, lastJumpIdx = 0;
        int destination = nums.length - 1;

        if (nums.length == 1)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;
            }

            if (lastJumpIdx >= destination)
                return totalJumps;
        }
        return totalJumps;
    }
}