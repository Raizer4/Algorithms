package practice.leetcode.prefix_sum.medium;

// Count Vowel Strings in Ranges
// https://leetcode.com/problems/count-vowel-strings-in-ranges/description/

public class Leetcode_2559 {

    public static void main(String[] args) {
        int[] ints = vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}});

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        String str = "aeiou";

        int[] prefix = new int[words.length + 1];

        for (int i = 0; i < words.length; i++) {
            prefix[i + 1] = str.indexOf(words[i].charAt(0)) != -1 && str.indexOf(words[i].charAt(words[i].length() - 1)) != -1 ? prefix[i] + 1 : prefix[i];
        }

        int[] res = new int[queries.length];
        int index = 0;

        for (int[] arr : queries){
            res[index++] = prefix[arr[1] + 1] - prefix[arr[0]];
        }

        return res;
    }

}
