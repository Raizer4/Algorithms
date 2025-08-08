package practice.leetcode.prefix_sum.medium;

// Minimum Penalty for a Shop
// https://leetcode.com/problems/minimum-penalty-for-a-shop/description/

public class Leetcode_2483 {

    public static void main(String[] args) {
        System.out.println(bestClosingTime("YNYYN"));
    }

    public static int bestClosingTime(String customers) {
        int[] left = new int[customers.length() + 1];
        int[] right = new int[customers.length() + 1];

        for (int i = 1; i <= customers.length(); i++) {
            left[i] = customers.charAt(i - 1) == 'N' ? left[i - 1] + 1 : left[i - 1] + 0;
        }

        for (int i = 1; i <= customers.length(); i++) {
            right[i] = customers.charAt(i - 1) == 'Y' ? right[i - 1] + 1 : right[i - 1] + 0;
        }

        int sum = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) != 'N'){continue;}
            int temp = (left[i]) + (right[customers.length()] - right[i]);

            if (sum > temp){
                sum = temp;
                index = i;
            }
        }

        if (left[customers.length()] < sum){
            index = customers.length();
        }

        return index;
    }

}
