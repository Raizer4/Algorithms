package practice.leetcode.siliding_window.medium;

// Maximum Number of Vowels in a Substring of Given Length
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1456 {

    public static void  main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowels("aeiou",2));
        System.out.println(maxVowels("leetcode",3));
    }

    public static int maxVowels(String s, int k) {
        int tempMax = 0;

        String str = "AOIUEaoiue";

        for (int i = 0; i < k; i++) {
            if (str.indexOf(s.charAt(i)) != -1){
                tempMax++;
            }
        }

        int max = tempMax;

        int l = 0;

        for (int r = k; r < s.length(); r++){

            if (str.indexOf(s.charAt(r)) != -1){
                tempMax++;
            }

            if (str.indexOf(s.charAt(l)) != -1){
                tempMax--;
            }

            l++;
            max = Math.max(max,tempMax);
        }


        return max;
    }



}
