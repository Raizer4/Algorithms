package practice.leetcode.siliding_window.hard;

// Maximum Fruits Harvested After at Most K Steps
// https://leetcode.com/problems/maximum-fruits-harvested-after-at-most-k-steps/description/?envType=daily-question&envId=2025-08-03

public class Leetcode_2106 {

    public static void main(String[] args) {
        System.out.println(maxTotalFruits(new int[][]{{0,9},{4,1},{5,7},{6,2},{7,4},{10,9}}, 5, 4));
        System.out.println(maxTotalFruits(new int[][]{{2,8},{6,3},{8,6}}, 5, 4));
        System.out.println(maxTotalFruits(new int[][]{{0,3},{6,4},{8,5}}, 3, 2));
        System.out.println(maxTotalFruits(new int[][]{{0,7},{7,4},{9,10},{12,6},{14,8},{16,5},{17,8},{19,4},{20,1},{21,3},{24,3},{25,3},{26,1},{28,10},{30,9},{31,6},{32,1},{37,5},{40,9}}, 21, 30));
    }

    public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int num = Math.max(startPos - k, 0);
        int integer = Math.min(startPos + k, fruits[fruits.length - 1][0]);

        int l = 0;
        int r = fruits.length - 1;

        int left = -1;
        int right = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (fruits[m][0] >= num && fruits[m][0] <= integer){
                left = m;
                r = m - 1;
            }else if (fruits[m][0] > integer){
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        l = 0;
        r = fruits.length - 1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (fruits[m][0] <= integer && fruits[m][0] >= num){
                right = m;
                l = m + 1;
            }else if (fruits[m][0] < num){
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        if (left == -1 || right == -1){
            return 0;
        }

        if (left == right){
            return fruits[r][1];
        }

        int couning = couning(fruits, left, right, k, startPos);

        return couning;
    }

    private static int couning(int[][] fruits, int l, int r, int k, int startPos){
        int prefix = 0;
        int answer = 0;

        int j = l;

        for (int i = l; i <= r; i++) {
            prefix += fruits[i][1];

            while (fruits[i][0] > startPos && (k - (startPos - fruits[j][0])) < (fruits[i][0] - fruits[j][0])){
                prefix -= fruits[j][1];
                j++;
            }

            answer = Math.max(answer, prefix);
        }

        prefix = 0;
        j = r;

        for (int i = r; i >= l; i--) {
            prefix += fruits[i][1];

            while (fruits[i][0] < startPos && (k - (fruits[j][0] - startPos)) < (fruits[j][0] - fruits[i][0])){
                prefix -= fruits[j][1];
                j--;
            }

            answer = Math.max(answer, prefix);
        }


        return answer;
    }

}
