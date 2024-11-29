package practice.challenge.leetcode_75.decision.day_9.similar;

// Check If a Word Occurs As a Prefix of Any Word in a Sentence
// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/

public class Leetcode_1455 {

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger","burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem","pro"));
        System.out.println(isPrefixOfWord("i am tired","you"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");

        for (int i = 0; i < s.length; i++){
            String s1 = s[i];
            if (s1.length() >= searchWord.length()){
               if (s1.substring(0,searchWord.length()).equals(searchWord)){
                   return i + 1;
               }
            }
        }

        return -1;
    }

}
