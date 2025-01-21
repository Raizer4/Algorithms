package practice.leetcode.siliding_window.medium;

// Count Number of Nice Subarrays
// https://leetcode.com/problems/count-number-of-nice-subarrays/description/

public class Leetcode_1248 {

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3));
        System.out.println(numberOfSubarrays(new int[]{2,4,6},1));
        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int oddCount = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 != 0){
                oddCount++;
            }

            while (oddCount > k){
                if (nums[l] % 2 != 0){
                    oddCount--;
                }
                l++;
            }

            if (oddCount == k){
                int tempLeft = l;
                while (tempLeft < r && nums[tempLeft] % 2 == 0){
                    tempLeft++;
                }
                res += (tempLeft - l + 1);
            }
        }

        return res;
    }

}
