package practice.leetcode.binary_search.easy;

// Binary Search
// https://leetcode.com/problems/binary-search/description/

public class Leetcode_704 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int medium;

        while (start <= end){
            medium = (end + start) / 2;

            if (nums[medium] > target){
                end = medium - 1;
            }else if (nums[medium] < target){
                start = medium + 1;
            }else {
                return medium;
            }

        }

        return -1;
    }

}
