package by.viachaslau;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        solution.merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastArray1ElementPointer = m - 1;
        int lastArray2ElementPointer = n - 1;
        int lastResultElementPointer = m + n - 1;

        while (lastArray1ElementPointer >= 0 && lastArray2ElementPointer >= 0) {
            if (nums1[lastArray1ElementPointer] > nums2[lastArray2ElementPointer])
                nums1[lastResultElementPointer--] = nums1[lastArray1ElementPointer--];
            else
                nums1[lastResultElementPointer--] = nums2[lastArray2ElementPointer--];
        }
        while (lastArray2ElementPointer >= 0) {
            nums1[lastResultElementPointer--] = nums2[lastArray2ElementPointer--];
        }
    }
}
