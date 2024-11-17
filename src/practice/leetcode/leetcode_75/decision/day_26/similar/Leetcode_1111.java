package practice.leetcode.leetcode_75.decision.day_26.similar;

// Maximum Nesting Depth of Two Valid Parentheses Strings
// https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/description/

public class Leetcode_1111 {

    public static void main(String[] args) {
        int[] ints = maxDepthAfterSplit("(()())");

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];

        int l = 1;
        int o = 0;

        int i = 0;

        int depth = 0;

        for (char temp : seq.toCharArray()){
            if (temp == '('){
                depth++;
                if (depth % 2 == 0){
                    res[i++] = l;
                }else {
                    res[i++] = o;
                }
            }else {
                if (depth % 2 == 0){
                    res[i++] = l;
                }else {
                    res[i++] = o;
                }
                depth--;
            }
        }

        return res;
    }

}
