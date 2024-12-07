package practice.leetcode.array.easy;

// Distribute Candies
// https://leetcode.com/problems/distribute-candies/description/

import java.util.Set;
import java.util.TreeSet;

public class Leetcode_575 {

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
    }

    public static int distributeCandies(int[] candyType) {
        int i = candyType.length / 2;

        Set<Integer> set = new TreeSet<>();

        for (int temp : candyType){
            set.add(temp);
        }

        if (set.size() <= i){
            return set.size();
        }else {
            return i;
        }
    }

}
