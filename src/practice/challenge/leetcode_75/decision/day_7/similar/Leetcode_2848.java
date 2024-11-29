package practice.challenge.leetcode_75.decision.day_7.similar;

// Points That Intersect With Cars
// https://leetcode.com/problems/points-that-intersect-with-cars/description/


import java.util.ArrayList;
import java.util.List;

public class Leetcode_2848 {

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();

        List<Integer> list_1 = new ArrayList<>();
        list_1.add(3);
        list_1.add(6);

        List<Integer> list_2 = new ArrayList<>();
        list_2.add(1);
        list_2.add(5);

        List<Integer> list_3 = new ArrayList<>();
        list_3.add(4);
        list_3.add(7);

        nums.add(list_1);
        nums.add(list_2);
        nums.add(list_3);

        System.out.println(numberOfPoints(nums));
    }

    public static int numberOfPoints(List<List<Integer>> nums) {
        int max = 0;

        for (List<Integer> temp : nums){
            max = Math.max(max,temp.get(1));
        }

        int[] count = new int[max + 2];


        for (List<Integer> temp : nums){
            int start = temp.get(0);
            int end = temp.get(1);
            count[start]++;
            count[end + 1]--;
        }

        int cover = 0;
        int point = 0;

        for (int i = 0; i <= max; i++){
            cover += count[i];

            if (cover > 0){
                point++;
            }
        }

        return point;
    }


}
