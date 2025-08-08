package practice.leetcode;

// Get Equal Substrings Within Budget
// https://leetcode.com/problems/get-equal-substrings-within-budget/description/

public class Leetcode_1208 {

    public static void main(String[] args) {
        System.out.println(equalSubstring("krrgw", "zjxss", 19));
    }

    public static int equalSubstring(String s, String t, int maxCost) {
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            int temp = t.charAt(i) - 'a' + 1;

            arr[i] = Math.abs(num - temp);
        }


        int answer = 0;
        int count = 0;
        int l = 0;

        for (int r = 0; r < arr.length; r++) {
            count += arr[r];

            while (count > maxCost){
                count-= arr[l];
                l++;
            }

            answer = Math.max(answer, (r - l + 1));
        }

        return answer;
    }

}
