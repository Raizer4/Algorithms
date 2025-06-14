package practice.leetcode.siliding_window.medium;

// Maximum Subarray With Equal Products
// https://leetcode.com/problems/maximum-subarray-with-equal-products/description/

public class Leetcode_3411 {

    public static void main(String[] args) {
        System.out.println(maxLength(new int[]{1,2,1,2,1,1,1}));
    }

    public static int maxLength(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int prod = nums[i];
            int currentGod = nums[i];
            int currentLcm = nums[i];

            for (int j = i; j < nums.length; j++) {
                if (i != j){
                    prod *= nums[j];
                    currentGod = gcd(currentGod, nums[j]);
                    currentLcm = lcm(currentLcm, nums[j]);
                }


                if (prod == currentGod * currentLcm){
                    res = Math.max(res, j - i + 1);
                }
            }

        }

        return res;
    }

    private static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }

}
