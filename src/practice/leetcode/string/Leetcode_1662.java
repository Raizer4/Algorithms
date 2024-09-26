package practice.leetcode.string;

// Check If Two String Arrays are Equivalent
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class Leetcode_1662 {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"},new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"},new String[]{"ab", "c"}));
        System.out.println(arrayStringsAreEqual(new String[]{"abc", "d", "defg"},new String[]{"abcddefg"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder_1 = new StringBuilder();
        StringBuilder builder_2 = new StringBuilder();

        for (String temp : word1){
            builder_1.append(temp);
        }

        for (String temp : word2){
            builder_2.append(temp);
        }


        return builder_1.toString().equals(builder_2.toString());
    }

}
