package practice.leetcode.siliding_window.medium;

// Maximize the Confusion of an Exam
// https://leetcode.com/problems/maximize-the-confusion-of-an-exam/description/

public class Leetcode_2024 {

    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("TTFF", 2));
    }


    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int t = 0;
        int f = 0;
        int l = 0;
        int max = 0;
        int res = 0;

        for (int r = 0; r < answerKey.length(); r++) {

            if (answerKey.charAt(r) == 'T'){
                t++;
                max = Math.max(max,t);
            }else {
                f++;
                max = Math.max(max,f);
            }

            while ((r - l + 1) - max > k){
                if (answerKey.charAt(l) == 'T'){
                    t--;
                }else {
                    f--;
                }
                l++;
            }

            res = Math.max(res,r - l + 1);
        }

        return res;
    }

}
