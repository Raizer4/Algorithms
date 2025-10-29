package practice.leetcode.two_pointers.medium;

// Interval List Intersections
// https://leetcode.com/problems/interval-list-intersections/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_986 {

    public static void main(String[] args) {
        System.out.println(intervalIntersection(new int[][]{{10,12},{18,19}}, new int[][]{{1,6},{8,11},{13,17},{19,20}}));
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length){
            if (firstList[i][0] <= secondList[j][1] && firstList[i][1] >= secondList[j][0]){
                list.add(new int[]{Math.max(firstList[i][0], secondList[j][0]), Math.min(firstList[i][1], secondList[j][1])});
            }

            if (firstList[i][1] <= secondList[j][1]){
                i++;
            }else {
                j++;
            }

        }

        int[][] answer = new int[list.size()][2];
        int k = 0;

        for (int[] arr : list){
            answer[k++] = arr;
        }

        return answer;
    }

}
