package practice.leetcode.array.easy;

// Plus One
// https://leetcode.com/problems/plus-one/description/


public class Leetcode_66 {

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1,2,3}));
        System.out.println(plusOne(new int[]{4,3,2,1}));
        System.out.println(plusOne(new int[]{9}));
        int[] ints = plusOne(new int[]{9,9});
        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
