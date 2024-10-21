package practice.leetcode.array.easy;

// Maximum Number of Words Found in Sentences
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/1428332676/

public class Leetcode_2114 {

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String temp : sentences){
            String[] s = temp.split(" ");
            if (max < s.length){
                max = s.length;
            }
        }

        return max;
    }

}
