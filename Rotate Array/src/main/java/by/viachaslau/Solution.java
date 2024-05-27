package by.viachaslau;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums, 2);

        for (int num : nums
        ) {
            System.out.print(num + " ");
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        
        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);


    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}