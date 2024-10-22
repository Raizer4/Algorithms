package practice.leetcode.leetcode_75.decision.day_1.similar;

// DI String Match
// https://leetcode.com/problems/di-string-match/description/

public class Leetcode_942 {

    public static void main(String[] args) {
        int[] ints = diStringMatch("IDID");
        for (int temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] diStringMatch(String s) {
        int i = 0;
        int j = s.length();

        int[] res = new int[s.length() + 1];

        for (int k = 0; k <= s.length(); k++) {

            if (k == s.length()){
                if (s.charAt(k - 1) == 'I'){
                    res[k] = i;
                }else {
                    res[k] = j;
                }
                break;
            }

            if (s.charAt(k) == 'I'){
                res[k] = i;
                i++;
            }else {
                res[k] = j;
                j--;
            }
        }

        return res;
    }

}
