package practice.challenge.leetcode_75.decision.day_12.similar;

// Merge Two 2D Arrays by Summing Values
// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/

import java.util.HashMap;
import java.util.TreeSet;

public class Leetcode_2570 {

    public static void main(String[] args) {
        int[][] ints = mergeArrays(new int[][]{{3, 2}, {2, 3}, {4,5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}});

        for (int[] arr : ints){
            for (int temp : arr){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int[] arr : nums1){
            map.put(arr[0],map.getOrDefault(arr[0], 0) + arr[1]);
        }

        for (int[] arr : nums2){
            map.put(arr[0],map.getOrDefault(arr[0], 0) + arr[1]);
        }

        int[][] arr = new int[map.keySet().size()][2];
        int index = 0;

        TreeSet<Integer> integers = new TreeSet<>();

        for (int temp : map.keySet()){
            integers.add(temp);
        }


        for (int key : integers){
            arr[index++] = new int[]{key,map.get(key)};
        }

        return arr;
    }

}
