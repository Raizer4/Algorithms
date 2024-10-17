package practice.leetcode.two_pointers.easy;

// Count Pairs Whose Sum is Less than Target
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2824 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(countPairs(list,2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.size(); i++){
            Integer integer = nums.get(i);

            for (int j = i + 1; j < nums.size(); j++) {
                if (integer + nums.get(j) < target){
                    count++;
                }
            }

        }

        return count;
    }

}
