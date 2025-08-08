package practice.leetcode.binary_search.medium;

// Maximum Candies Allocated to K Children
// https://leetcode.com/problems/maximum-candies-allocated-to-k-children/description/

public class Leetcode_2226 {

    public static void main(String[] args) {
        System.out.println(maximumCandies(new int[]{5,8,6}, 3));
    }

    public static int maximumCandies(int[] candies, long k) {
        long l = 1;
        long r = 0;

        for (int temp : candies){
            r = Math.max(r, temp);
        }

        long answer = 0;

        while (l <= r){
           long m = l + (r - l) / 2;
            long count = 0;

           for (int temp : candies){
                count += temp / m;
           }

           if (count >= k){
               l = m + 1;
               answer = Math.max(answer, m);
           }else {
               r = m - 1;
           }

        }

        return (int) answer;
    }

}
