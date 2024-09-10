package practice.leetcode.random.easy.array;

// Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1672 {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
        System.out.println(maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }

    public static int maximumWealth(int[][] accounts) {
        List<Integer> res = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                max += accounts[i][j];
            }
            res.add(max);
            max = 0;
        }

        return Collections.max(res);
    }

}
