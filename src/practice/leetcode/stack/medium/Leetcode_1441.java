package practice.leetcode.stack.medium;

// Build an Array With Stack Operations
// https://leetcode.com/problems/build-an-array-with-stack-operations/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1441 {

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3}, 3));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<Integer> list = new ArrayList<>();

        for (int temp : target){
            list.add(temp);
        }


        int end = target[target.length - 1];

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= end; i++){


            if (list.contains(i)){
                result.add("Push");
            }else {
                result.add("Push");
                result.add("Pop");
            }

            if (i == n){
                return result;
            }

        }

        return result;
    }

}
