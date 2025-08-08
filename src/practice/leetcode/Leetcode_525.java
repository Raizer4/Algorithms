package practice.leetcode;

// Contiguous Array
// https://leetcode.com/problems/contiguous-array/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_525 {

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0,1,1,1,1,1,0,0,0}));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, int[]> map = new HashMap();
        map.put(0, new int[]{0,0});

        int zero = 0;
        int one = 0;

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0){
                zero++;
            } else {
                one++;
            }

            int temp = zero - one;

            if (map.containsKey(temp)){
                int[] arr = map.get(temp);
                answer = Math.max(answer, ((zero - arr[0]) + (one - arr[1])));
            }else {
                map.put(temp, new int[]{zero, one});
            }

        }


        return answer;
    }

}
