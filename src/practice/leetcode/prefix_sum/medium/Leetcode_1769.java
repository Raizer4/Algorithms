package practice.leetcode.prefix_sum.medium;

// Minimum Number of Operations to Move All Balls to Each Box
// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/

public class Leetcode_1769 {

    public static void main(String[] args) {
        int[] ints = minOperations("001011");

        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] minOperations(String boxes) {
        int temp = 0;
        int prefix = 0;

        int[] arr = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            arr[i] += prefix + temp;

            if (boxes.charAt(i) == '1'){
                temp++;
            }

            prefix = arr[i];
        }

        int[] arr_t = new int[boxes.length()];
        temp = 0;
        prefix = 0;

        for (int i = boxes.length() - 1; i >= 0; i--) {
            arr_t[i] += prefix + temp;

            if (boxes.charAt(i) == '1'){
                temp++;
            }

            prefix = arr_t[i];
        }

        int[] res = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            res[i] = (arr[i] + arr_t[i]);
        }

        return res;
    }

}
