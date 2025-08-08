package practice.leetcode.binary_search.medium;

// Minimum Limit of Balls in a Bag
// https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/description/

public class Leetcode_1760 {

    public static void main(String[] args) {
        System.out.println(minimumSize(new int[]{2,4,8,2},4));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        long l = 1;
        long r = 0;

        for (int temp : nums){
            r = Math.max(r,temp);
        }

        long answer = r;

        while (l <= r) {
            long m = l + (r - l) / 2;
            long total = 0;

            for (int num : nums){
                total += (num - 1) / m;
            }

            if (total <= maxOperations) {
                answer = m;
                r = m - 1;
            } else {
                l = m + 1;
            }

        }


        return (int) answer;
    }


}
