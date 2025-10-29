package practice.leetcode.greedy.medium;

// Advantage Shuffle
// https://leetcode.com/problems/advantage-shuffle/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_870 {

    public static void main(String[] args) {
        System.out.println(advantageCount(new int[]{1,4,0,2,2}, new int[]{2,0,2,1,4}));
    }

    public static int[] advantageCount(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for (int temp : nums1){
            list.add(temp);
        }

        int[] answer = new int[nums1.length];

        Collections.sort(list);


        for (int i = 0; i < nums2.length; i++) {
            int num = check(list, nums2[i]);

            if (num == -1){
                answer[i] = list.get(0);
                list.remove(0);
            }else {
                answer[i] = list.get(num);
                list.remove(num);
            }
        }

        return answer;
    }

    private static int check(List<Integer> list, int num){
        int l = 0;
        int r = list.size() - 1;

        int index = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (list.get(m) > num){
                index = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return index;
    }

}
