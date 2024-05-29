package by.viachaslau;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 6, 1, 5};
        System.out.println(solution.hIndex(nums));

    }

    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];
        for (int citation : citations) {
            if (citation >= n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }
        int position = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < count[i]; j++) {
                citations[position] = i;
                position++;
            }
        }
        int hIndex = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] < hIndex) {
                return hIndex - 1;
            }
            hIndex++;
        }
        return n;
    }
}