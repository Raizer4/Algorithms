package practice.leetcode.leetcode_75.decision.day_3.similar;

// Minimum Number Game
// https://leetcode.com/problems/minimum-number-game/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_2974 {

    public static void main(String[] args) {
        int[] ints = numberGame(new int[]{5, 4, 2, 3});

        for (int temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] numberGame(int[] nums) {
        List<Integer> listTemp = new ArrayList<>();

        for (int temp : nums){
            listTemp.add(temp);
        }

        int[] arr = new int[nums.length];

        int index = 0;

        while (!listTemp.isEmpty()){
            Integer min_1 = Collections.min(listTemp);
            listTemp.remove(min_1);
            Integer min_2 = Collections.min(listTemp);
            listTemp.remove(min_2);
            arr[index++] = min_2;
            arr[index++] = min_1;
        }

        return arr;
    }

}
