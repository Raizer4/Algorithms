package practice.leetcode.leetcode_75.decision.day_3.similar;

// Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1389 {

    public static void main(String[] args) {
        System.out.println(createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1}));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            list.add(index[i],nums[i]);
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }

}
