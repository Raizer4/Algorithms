package practice.leetcode.siliding_window.medium;

// Grumpy Bookstore Owner
// https://leetcode.com/problems/grumpy-bookstore-owner/description/

public class Leetcode_1052 {

    public static void main(String[] args) {
        System.out.println(maxSatisfied(new int[]{1,0,1,2,1,1,7,5}, new int[]{0,1,0,1,0,1,0,1},3));
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0){
                res += customers[i];
            }
        }

        int temp = 0;

        for (int i = 0; i < minutes; i++){
            if (grumpy[i] == 1){
                temp += customers[i];
            }
        }

        int max = temp;

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1){
                temp += customers[i];
            }

            if (grumpy[i - minutes] == 1){
                temp -= customers[i - minutes];
            }
            max = Math.max(max,temp);
        }

        return res + max;
    }

}
