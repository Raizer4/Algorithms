package practice.leetcode.binary_search.medium;

// Minimum Speed to Arrive on Time
// https://leetcode.com/problems/minimum-speed-to-arrive-on-time/description/

public class Leetcode_1870 {

    public static void main(String[] args) {
        System.out.println(minSpeedOnTime(new int[]{1,1,100000}, 2.01));
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int l = 1;
        int r = 0;

        for (int temp : dist) {
            r = Math.max(r, temp);
        }

        int answer = -1;

        r *= 100;

        while (l <= r) {
            int m = l + (r - l) / 2;

            double num = 0;

            for (int i = 0; i < dist.length; i++) {
                int temp = dist[i];

                if (i == dist.length - 1){
                    num += ((double) temp / m);
                }else {
                    num += Math.ceil((double) temp / m);
                }
            }

            if (num <= hour){
                answer = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return answer;
    }

}
