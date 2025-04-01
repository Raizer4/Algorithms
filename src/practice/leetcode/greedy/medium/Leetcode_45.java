package practice.leetcode.greedy.medium;

// Jump Game II
// https://leetcode.com/problems/jump-game-ii/description/

public class Leetcode_45 {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,0,1,4}));
    }

    public static int jump(int[] nums) {
        int res = 0, l = 0, r = 0;

        while (r < nums.length - 1){
            int current = 0;

            for (int i = l; i <= r; i++){
                current = Math.max(current, i + nums[i]);
            }

            l = r + 1;
            r = current;
            res++;
        }

        return res;
    }

}
