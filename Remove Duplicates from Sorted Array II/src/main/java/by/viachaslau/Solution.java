package by.viachaslau;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1};
        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        if (nums.length <= 2) return nums.length;

        int k = 2;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
