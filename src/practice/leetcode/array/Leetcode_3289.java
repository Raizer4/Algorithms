package practice.leetcode.array;

// The Two Sneaky Numbers of Digitville
// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_3289 {

    public static void main(String[] args) {
        int[] sneakyNumbers = getSneakyNumbers(new int[]{0, 1, 1, 0});
        for (int temp : sneakyNumbers){
            System.out.println(temp);
        }
    }

    public static int[] getSneakyNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }else {
                result.add(nums[i]);
            }
        }

        int[] ints = new int[result.size()];

        for (int i = 0; i < result.size(); i++){
            ints[i] = result.get(i);
        }


        return ints;
    }

}
