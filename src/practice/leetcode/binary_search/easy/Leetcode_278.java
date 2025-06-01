package practice.leetcode.binary_search.easy;

// First Bad Version
// https://leetcode.com/problems/first-bad-version/description/

public class Leetcode_278 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.firstBadVersion(5);
    }

    static class VersionControl{
        public static boolean isBadVersion(int n){
            return false;
        }
    }

     static class Solution extends VersionControl {

        public int firstBadVersion(int n) {
            int l = 1;
            int r = n;

            int res = 0;

            while (l <= r){
               int m = l + (r - l) / 2;

               if (isBadVersion(m)){
                    res = m;
                    r = m - 1;
               }else {
                    l = m + 1;
               }

            }

            return res;
        }


    }

}
