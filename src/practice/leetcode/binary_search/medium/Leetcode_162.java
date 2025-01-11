package practice.leetcode.binary_search.medium;

// Find Peak Element
// https://leetcode.com/problems/find-peak-element/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_162 {

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{
                1,2,1,3,5,6,4
        }));
    }

    public static int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r){
            int m = (l + r) / 2;

            if (nums[m] > nums[m + 1]){
                r = m;
            }else {
                l = m + 1;
            }

        }

        return l;
    }


}
