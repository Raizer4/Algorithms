package practice.leetcode.leetcode_75.decision.day_5.similar;

// Reverse Only Letters
// https://leetcode.com/problems/reverse-only-letters/description/

public class Leetcode_917 {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

       while (i < j){

           while (i < j && !Character.isLetter(s.charAt(i))) {
               i++;
           }

           while (i < j && !Character.isLetter(s.charAt(j))) {
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
