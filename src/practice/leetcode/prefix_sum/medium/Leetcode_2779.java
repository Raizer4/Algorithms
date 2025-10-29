package practice.leetcode.prefix_sum.medium;

// Maximum Beauty of an Array After Applying Operation
// https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation/description/

public class Leetcode_2779 {

    public static void main(String[] args) {
        System.out.println(maximumBeauty(new int[]{4,6,1,2},2));
        System.out.println(maximumBeauty(new int[]{1,1,1,1},10));
    }

    public static int maximumBeauty(int[] nums, int k) {
        int max = 0;

        for (int temp : nums){
            max = Math.max(max, temp);
        }

        int[] prefix = new int[max + k + 2];

        for (int temp : nums){
            prefix[temp >= k ? temp - k : 0] += 1;
            prefix[temp + k + 1] -= 1;
        }

        int answer = prefix[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = (prefix[i - 1] + prefix[i]);
            answer = Math.max(prefix[i], answer);
        }

        return answer;
    }

}
