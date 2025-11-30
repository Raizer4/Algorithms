package practice.leetcode.prefix_sum.medium;

// Shifting Letters II
// https://leetcode.com/problems/shifting-letters-ii/description/

public class Leetcode_2381 {

    public static void main(String[] args) {
        System.out.println(shiftingLetters("dztz", new int[][]{{0,0,0},{1,1,1}}));
    }

    public static String shiftingLetters(String s, int[][] shifts) {
        int[] prefix = new int[s.length() + 1];

        for (int[] arr : shifts){

            if (arr[2] == 1){
                prefix[arr[0]] += 1;
                prefix[arr[1] + 1] -= 1;
            }else {
                prefix[arr[0]] -= 1;
                prefix[arr[1] + 1] += 1;
            }

        }

        int[] answer = new int[s.length()];
        answer[0] = prefix[0];

        for (int i = 1; i < s.length(); i++) {
            answer[i] = answer[i - 1] + prefix[i];
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < answer.length; i++) {
            int d = s.charAt(i) - 'a';
            int temp = (d + answer[i]) % 26;
            if (temp < 0) temp += 26;
            char c = (char) ('a' + temp);
            builder.append(c);
        }

        return builder.toString();
    }

}
