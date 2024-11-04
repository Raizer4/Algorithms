package practice.leetcode.leetcode_75.decision.day_5;

// Reverse Vowels of a String
// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_345 {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        String vowels = "aeiouAEIOU";


        while (i < j){
            while (vowels.indexOf(chars[i]) == -1){
                i++;
            }

            while (vowels.indexOf(chars[j]) == -1){
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }


        return new String(chars);
    }

}
