package practice.leetcode.siliding_window.medium;

// Longest Substring Of All Vowels in Order
// https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/description/

public class Leetcode_1839 {

    public static void main(String[] args) {
        System.out.println(longestBeautifulSubstring("ueiouuei"));
    }

    public static int longestBeautifulSubstring(String word) {
        char[] arr = new char[]{'a', 'e', 'i', 'o', 'u'};

        int l = 1;
        int r = 0;

        int index = 0;
        int answer = 0;

        while (r < word.length()){
            if (arr[index] != word.charAt(r)){
                index = 0;

                while (r < word.length() && arr[index] != word.charAt(r)) {
                    r++;
                }

                l = r + 1;
            }

             while (r < word.length() && arr[index] == word.charAt(r)){
                r++;
            }

            if (index == 4){
                answer = Math.max(answer, (r - l + 1));
            }

            if (index < 4) {
                index++;
            }

        }

        return answer;
    }

}
