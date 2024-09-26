package practice.leetcode.array;

// Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2942 {

    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet","code"},'e'));
        System.out.println(findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"},'a'));
        System.out.println(findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"},'z'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++){
            if (words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }

        return result;
    }

}

