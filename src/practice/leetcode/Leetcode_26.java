package practice.leetcode;

// Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < nums.length;i++){
            int temp = nums[i];
            if (!list.contains(temp)){
                nums[k] = temp;
                list.add(temp);
                k++;
            }
        }

        return list.size();
    }

}
