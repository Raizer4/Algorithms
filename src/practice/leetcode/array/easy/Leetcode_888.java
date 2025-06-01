package practice.leetcode.array.easy;

// Fair Candy Swap
// https://leetcode.com/problems/fair-candy-swap/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_888 {

    public static void main(String[] args) {
        int[] ints = fairCandySwap(new int[]{2}, new int[]{1,3});

        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = Arrays.stream(aliceSizes).sum();
        int sumBob = Arrays.stream(bobSizes).sum();

        int target = (sumAlice - sumBob) / 2;

        Set<Integer> setA = new HashSet<>();

        for (int temp : aliceSizes){
            setA.add(temp);
        }

        for (int temp : bobSizes){
            if (setA.contains(target + temp)){
                return new int[]{target + temp, temp};
            }
        }


        return new int[]{};
    }




}
