package practice.leetcode.siliding_window.hard;

// Count Subarrays With Fixed Bounds
// https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/

public class Leetcode_2444 {

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1,3,5,2,7,5}, 1, 5));
        System.out.println(countSubarrays(new int[]{1,1,1,1}, 1, 1));
        System.out.println(countSubarrays(new int[]{4,3}, 3, 3));
    }

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long countMax = 0;
        long countMin = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int l = 0;
        long answer = 0;

        int count = 0;

        for (int r = 0; r < nums.length; r++) {
            min = Math.min(min, nums[r]);
            max = Math.max(max, nums[r]);

            if (nums[r] == minK){
                countMin++;
            }

            if (nums[r] == maxK){
                countMax++;
            }

            if (min == minK && max == maxK) {

                while (l < r) {
                    boolean flag = false;

                    if (nums[l] == minK) {
                        if ((countMin - 1) > 0) {
                            countMin--;
                            flag = true;
                        }
                    } else if (nums[l] == maxK) {
                        if ((countMax - 1) > 0) {
                            countMax--;
                            flag = true;
                        }
                    } else {
                        flag = true;
                    }

                    if (flag) {
                        count++;
                        l++;
                    } else {
                        break;
                    }
                }

                answer += (1 + count);
            }

            if (min < minK || max > maxK){
                count = 0;
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
                countMax = 0;
                countMin = 0;
                l = r + 1;
            }

        }


        return answer;
    }

}
