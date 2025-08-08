package practice.leetcode.binary_search.medium;

// Find the Smallest Divisor Given a Threshold
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

public class Leetcode_1283 {

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,5,9}, 6));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 0;

        for(int temp:nums){
            r = Math.max(r, temp);
        }

        int res = 0;

        while (l <= r){
            int m = l + (r - l) / 2;
            int total = 0;

            for (int temp : nums){
                total += (temp + m - 1) / m;
                if (total > threshold){break;}
            }

            if (total <= threshold){
                res = m;
                r = m - 1;
            }else {
                l = m + 1;
            }
        }

        return res;
    }
}


