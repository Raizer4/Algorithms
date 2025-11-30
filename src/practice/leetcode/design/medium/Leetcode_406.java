package practice.leetcode.design.medium;

// Queue Reconstruction by Height
// https://leetcode.com/problems/queue-reconstruction-by-height/description/?envType=problem-list-v2&envId=binary-indexed-tree

import java.util.Arrays;

public class Leetcode_406 {

    public static void main(String[] args) {
        System.out.println(reconstructQueue(new int[][]{{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}}));
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b)-> {
            if (a[0] != b[0]){
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < people.length; i++) {
            if (people[i][1] == i){
                continue;
            }

            int index = people[i][1];

            int[] temp = people[people[i][1]];
            int[] arr = people[i];

            people[people[i][1]] = arr;

            swap(people,index + 1, temp, i);
        }

        return people;
    }

    private static void swap(int[][] people, int index, int[] temp, int end){
        int[] arr = people[index];
        people[index] = temp;
        if (index == end){
            return;
        }
        swap(people, index + 1, arr, end);
    }

}
