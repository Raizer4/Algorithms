package practice.leetcode.leetcode_75.decision.day_10.similar;

// Find All K-Distant Indices in an Array
// https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2200 {

    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[]{3,4,9,1,3,9,5},9,1));
        System.out.println(findKDistantIndices(new int[]{2,2,2,2,2},2,2));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> listJ = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == key){
                listJ.add(i);
            }
        }

        if (listJ.isEmpty()){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (Integer temp : listJ){
                if (Math.abs(i - temp) <= k){
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }

}
