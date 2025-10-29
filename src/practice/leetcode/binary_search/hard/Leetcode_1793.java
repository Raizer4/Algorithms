package practice.leetcode.binary_search.hard;

// Maximum Score of a Good Subarray
// https://leetcode.com/problems/maximum-score-of-a-good-subarray/description/

public class Leetcode_1793 {

    public static void main(String[] args) {
        System.out.println(maximumScore(new int[]{5,5,4,5,4,1,1,1}, 0));
    }

    public static int maximumScore(int[] nums, int k) {
        int[][] arr = new int[k + 1][2];
        int[][] res = new int[nums.length - k][2];

        int j = 0;
        int min = nums[k];

        for (int i = k; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            arr[j++] = new int[]{min, i};
        }

        min = nums[k];
        j = 0;

        for (int i = k; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            res[j++] = new int[]{min, i};
        }

        int answer = 0;
        int temp = nums[k];

        while (temp > 0){
            int left = check(arr, temp);
            int right = check(res, temp);

            if (left == -1 || right == -1){
                continue;
            }

            int num = ((right - left + 1) * temp);
            answer = Math.max(answer, num);
            temp--;
        }

        return answer;
    }

    private static int check(int[][] arr, int min){
        int l = 0;
        int r = arr.length - 1;

        int answer = -1;

        while (l <= r){
            int m = l + (r - l) / 2;
            int[] temp = arr[m];

            if (temp[0] >= min){
                answer = temp[1];
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return answer;
    }

}
