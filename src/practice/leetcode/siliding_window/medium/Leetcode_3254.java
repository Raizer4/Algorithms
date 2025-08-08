package practice.leetcode.siliding_window.medium;

// Find the Power of K-Size Subarrays I
// https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/description/

public class Leetcode_3254 {

    public static void main(String[] args) {
        System.out.println(resultsArray(new int[]{1,2,3,4,3,2,5}, 3));
    }

    public static int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        if (k == 1) {
            for (int i = 0; i < n; i++) {
                result[i] = nums[i];
            }
            return result;
        }

        boolean isConsecutive = true;
        int max = nums[0];

        for (int i = 1; i < k; i++) {
            if (nums[i] != nums[i - 1] + 1){
                isConsecutive = false;
            }
            if (nums[i] > max){
                max = nums[i];
            }
        }

        result[0] = isConsecutive ? max : -1;

        for (int i = 1; i <= n - k; i++) {
            int left = i;
            int right = i + k - 1;

            if (isConsecutive){
                if (nums[right] == nums[right - 1] + 1){
                    max = nums[right];
                    result[i] = max;
                }else {
                    isConsecutive = false;
                    result[i] = -1;
                }
            }else {
                isConsecutive = true;
                max = nums[left];

                for (int j = left + 1; j <= right; j++) {
                    if (nums[j] != nums[j - 1] + 1){
                        isConsecutive = false;
                    }
                    if (nums[j] > max){
                        max = nums[j];
                    }
                }
                result[i] = isConsecutive ? max : -1;
            }
        }

        return result;
    }

}
