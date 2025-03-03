package practice.leetcode.string.easy;

// Maximum Score After Splitting a String
// https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/

public class Leetcode_1422 {

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
        System.out.println(maxScore("00"));
        System.out.println(maxScore("01001"));
    }

    public static int maxScore(String s) {
        int max = 0;
        int zero = 0;
        int zeroTemp = 0;
        int one = 0;
        int oneTemp = 0;

        for (char temp : s.toCharArray()){
            if (temp == '1'){
                one++;
            }else {
                zeroTemp++;
            }
        }

        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i) == '0'){
                max = Math.max(max,one + ++zero);
            }else {
                max = Math.max(max,--one);
            }
        }


        for (int i = s.length() - 1; i >= s.length() / 2; i--){
            if (s.charAt(i) == '1'){
                max = Math.max(max,zeroTemp + ++oneTemp);
            }else {
                max = Math.max(max,--zeroTemp);
            }
        }

        return max;
    }


}
