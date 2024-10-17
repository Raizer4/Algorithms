package practice.leetcode.hash_table.easy;

// Longest Palindrome
// https://leetcode.com/problems/longest-palindrome/description/?envType=problem-list-v2&envId=greedy&difficulty=EASY

import java.util.HashMap;
import java.util.Map;

public class Leetcode_409 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("ccc"));
    }

    public static Integer longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for (char temp : s.toCharArray()){
            map.put(temp,map.getOrDefault(temp, 0) + 1);
        }

        int count = 0;

        boolean flag = false;

        for (Integer temp : map.values()){
            if (temp % 2 == 0){
                count += temp;
            }else{
                count += temp-1;
                flag = true;
            }
        }

        if (flag){
            count++;
        }

        return count;
    }

}
