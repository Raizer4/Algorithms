package practice.leetcode.greedy.medium;

// Merge Triplets to Form Target Triplet
// https://leetcode.com/problems/merge-triplets-to-form-target-triplet/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1899 {

    public static void main(String[] args) {
        System.out.println(mergeTriplets(new int[][]{}, new int[]{}));
    }

    public static boolean mergeTriplets(int[][] triplets, int[] target) {
        List<int[]> list_1 = new ArrayList<>();
        List<int[]> list_2 = new ArrayList<>();
        List<int[]> list_3 = new ArrayList<>();

        for (int i = 0; i < triplets.length; i++) {
            int[] arr = triplets[i];

            if (arr[0] == target[0]){
                list_1.add(arr);
            }

            if (arr[1] == target[1]){
                list_2.add(arr);
            }

            if (arr[2] == target[2]){
                list_3.add(arr);
            }

        }

        for (int[] arr_1 : list_1){
            for (int[] arr_2 : list_2){
                int[] ints = {Math.max(arr_1[0], arr_2[0]), Math.max(arr_1[1], arr_2[1]), Math.max(arr_1[2], arr_2[2])};

                if (check(ints, target)){
                    return true;
                }

                for (int[] arr_3 : list_3){
                    if (check(new int[]{Math.max(ints[0], arr_3[0]), Math.max(ints[1], arr_3[1]), Math.max(ints[2], arr_3[2]) }, target)){
                        return true;
                    }
                }

            }
        }

        return false;
    }

    private static boolean check(int[] arr ,int[] target){
        return arr[0] == target[0] && arr[1] == target[1] && arr[2] == target[2];
    }

}
