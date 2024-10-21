package practice.leetcode.array.easy;

// Find Indices of Stable Mountains
// https://leetcode.com/problems/find-indices-of-stable-mountains/description/

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Leetcode_3285 {

    public static void main(String[] args) {
        System.out.println(stableMountains(new int[]{10,1,10,1,10},2));
    }

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < height.length; i++){
            if (height[i - 1] > threshold){
                list.add(i);
            }
        }

        return list;
    }

}
