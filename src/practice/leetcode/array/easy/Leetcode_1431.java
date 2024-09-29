package practice.leetcode.array.easy;

// Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431 {

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int temp : candies){
            if (max < temp){
                max = temp;
            }
        }

        for (int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }
        }

        return result;
    }

}
