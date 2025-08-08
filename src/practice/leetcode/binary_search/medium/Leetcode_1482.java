package practice.leetcode.binary_search.medium;

// Minimum Number of Days to Make m Bouquets
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

public class Leetcode_1482 {

    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 1));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if ( (bloomDay.length / k) < m){
            return -1;
        }

        int l = Integer.MAX_VALUE;
        int r = 0;

        for (int temp : bloomDay){
            l = Math.min(l, temp);
            r = Math.max(r, temp);
        }

        int answer = 0;

        while (l <= r){
            int mid = l + (r - l) / 2;

            int count = 0;
            int left = 0;

            for (int right = 0; right < bloomDay.length; right++) {
                if (bloomDay[right] > mid){
                    count += ((right - left) / k);
                    left = right + 1;
                } else if (bloomDay.length - 1 == right){
                    count += ((bloomDay.length - left) / k);
                }

            }

            if (count < m){
                l = mid + 1;
            }else {
                answer = mid;
                r = mid - 1;
            }

        }


        return answer;
    }

}
