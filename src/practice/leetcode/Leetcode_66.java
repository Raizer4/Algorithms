package practice.leetcode;

// Plus One
// https://leetcode.com/problems/plus-one/description/

import java.math.BigInteger;

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
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            builder.append(digits[i]);
        }

        BigInteger anInt = new BigInteger(builder.toString());
        anInt = anInt.add(BigInteger.ONE);

        builder = new StringBuilder(String.valueOf(anInt));

        char[] array = builder.toString().toCharArray();
        int[] result = new int[array.length];
        int i = 0;
        for (char temp : array){
            result[i] = Integer.parseInt(String.valueOf(temp));
            i++;
        }

        return result;
    }

}
