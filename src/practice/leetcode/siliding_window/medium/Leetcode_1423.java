package practice.leetcode.siliding_window.medium;

// Maximum Points You Can Obtain from Cards
// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class Leetcode_1423 {

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1,2,3,4,5,6,1}, 3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int l = cardPoints.length - k;
        int r = 0;

        int prefix = 0;

        for (int i = l; i < cardPoints.length; i++) {
            prefix += cardPoints[i];
        }

        int answer = prefix;

        while (l <= cardPoints.length - 1){
            prefix -= cardPoints[l];
            prefix += cardPoints[r];

            answer = Math.max(answer, prefix);
            l++;
            r++;
        }

        return answer;
    }

}
