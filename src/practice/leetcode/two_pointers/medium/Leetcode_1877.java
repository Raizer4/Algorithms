package practice.leetcode.two_pointers.medium;

// Minimize Maximum Pair Sum in Array
// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/


public class Leetcode_1877 {

    public static void main(String[] args) {
        System.out.println(minPairSum(new int[]{3,5,2,3}));
    }

    public static int minPairSum(int[] nums) {
        int max = 0;

        for (int temp : nums){
            max = Math.max(max, temp);
        }

        int[] arr = new int[max + 1];

        for (int temp : nums){
            arr[temp]++;
        }

        int[] array = new int[nums.length];
        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (arr[i] > 0){
                array[index++] = i;
                arr[i]--;
            }
        }

        int l = 0;
        int r = nums.length - 1;
        int maxim = 0;

        while (l <= r){
            maxim = Math.max(maxim, array[l] + array[r]);
            l++;
            r--;
        }

        return maxim;
    }

}
