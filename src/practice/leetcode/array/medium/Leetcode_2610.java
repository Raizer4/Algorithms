package practice.leetcode.array.medium;

// Convert an Array Into a 2D Array With Conditions
// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2610 {

    public static void main(String[] args) {
        System.out.println(findMatrix(new int[]{1,3,4,1,2,3,1}));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int temp : nums){
            list.add(temp);
        }

        while (!list.isEmpty()){
            List<Integer> tempList = new ArrayList<>();
            int size = list.size();

            for (int i = size - 1; i >= 0; i--){
                if (!tempList.contains(list.get(i))){
                    tempList.add(list.remove(i));
                }
            }

            result.add(tempList);
        }

        return result;
    }


}
