package practice.leetcode.array.medium;

// Find the Kth Largest Integer in the Array
// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/description/

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1985 {

    public static void main(String[] args) {
        System.out.println(kthLargestNumber(new String[]{"d"}, 1));
    }

    public static String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> list = new ArrayList<>();

        for (String temp : nums){
            BigInteger bigInteger = new BigInteger(temp);
            list.add(bigInteger);
        }

        Collections.sort(list, Collections.reverseOrder());


        return String.valueOf(list.get(k - 1));
    }

}
