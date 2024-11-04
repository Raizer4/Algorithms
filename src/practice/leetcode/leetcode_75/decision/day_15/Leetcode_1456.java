package practice.leetcode.leetcode_75.decision.day_15;

// Maximum Number of Vowels in a Substring of Given Length
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1456 {

    public static void  main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowels("aeiou",2));
        System.out.println(maxVowels("leetcode",3));
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        String vowels = "aoieuAOIEU";

        for (int i = 0; i < k; i++){
            if (vowels.indexOf(s.charAt(i)) != -1){
                max++;
            }
        }

        int current = max;

        for (int i = k; i < s.length(); i++){
            if (vowels.indexOf(s.charAt(i - k)) != -1){
                current--;
            }

            if (vowels.indexOf(s.charAt(i)) != -1){
                current++;
            }
            max = Math.max(max,current);
        }

        return max;
    }



}
