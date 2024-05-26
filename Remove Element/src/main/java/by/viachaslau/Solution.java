package by.viachaslau;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1};
        int val = 1;
        int k = solution.removeElement(nums, val);

        System.out.println("Количество элементов, не равных " + val + ": " + k);
        System.out.print("Измененный массив: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int p = nums.length - 1;
        for (int i = 0; i <= p; i++) {
            if (nums[i] == val) {
                nums[i] = nums[p];
                nums[p] = val;
                p--;
                i--;
            }
        }
        return p + 1;
    }
}