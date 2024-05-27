package by.viachaslau;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums));


    }

    public int majorityElement(int[] nums) {
        int candidate_for_majority = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate_for_majority = num;
            }
            count += (num == candidate_for_majority) ? 1 : -1;
        }
        return candidate_for_majority;
    }
}