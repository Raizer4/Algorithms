package practice.leetcode.binary_search.medium;

// Minimized Maximum of Products Distributed to Any Store
// https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/description/

public class Leetcode_2064 {

    public static void main(String[] args) {
        System.out.println(minimizedMaximum(7, new int[]{15, 10, 10}));
    }

    public static int minimizedMaximum(int n, int[] quantities) {
        int l = 1;
        int r = 0;
        for (int temp:quantities){r = Math.max(r, temp);}

        int answer = 0;

        while (l <= r){
            int m = l + (r - l) / 2;
            int total = 0;

            for (int temp : quantities){
                int num = (int) Math.ceil((double) temp / m);
                total += num;
            }

            if (total <= n){
                answer = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return answer;
    }

}
