package practice.leetcode.dynamic_programming;

// Number of Sub-arrays With Odd Sum
// https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/description/

public class Leetcode_1524 {

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{1,2,3,4,5,6,7}));
    }

    public static int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int prefix = 0;
        int odd = 0;
        int even = 1;
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            if (prefix % 2 == 1){
                answer = (answer + even) % MOD;
                odd++;
            }else {
                answer = (answer + odd) % MOD;
                even++;
            }

        }

        return answer;
    }

}
