package practice.challenge.leetcode_75.decision.day_1;

// Merge Strings Alternately
// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1768 {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcd","pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();

        int i = 0;

        while (i < Math.min(word1.length(),word2.length())){
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(i));
            i++;
        }

        if (i != word1.length()){
            builder.append(word1.substring(i,word1.length()));
        }else if (i != word2.length()){
            builder.append(word2.substring(i,word2.length()));
        }

        return builder.toString();
    }

}
