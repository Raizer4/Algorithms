package practice.leetcode.greedy.medium;

// Equal Sum Arrays With Minimum Number of Operations
// https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations/description/

import java.util.Arrays;

public class Leetcode_1775 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{5,6,4,3,1,2}, new int[]{6,3,3,1,4,5,3,4,1,3,4}));
    }

    public static int minOperations(int[] nums1, int[] nums2) {
        if (nums1.length > (nums2.length * 6) || nums2.length > (nums1.length * 6)){
            return -1;
        }

        int sum1 = Arrays.stream(nums1).sum();
        int sum2 = Arrays.stream(nums2).sum();

        if (sum1 == sum2){
            return 0;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int count = 0;

        if (sum1 > sum2){
            int r = nums1.length - 1;
            int l = 0;

            while (sum1 > sum2){
                if (r < 0){
                    int gama = (6 - nums2[l]);
                    sum2 += gama;
                    l++;
                    count++;
                    continue;
                } else if (l >= nums2.length) {
                    int delta = nums1[r] - 1;
                    sum1 -= delta;
                    r--;
                    count++;
                    continue;
                }

                int delta = nums1[r] - 1;
                int gama = (6 - nums2[l]);

                if (delta == 0 && gama == 0){
                    return -1;
                }

                if (delta > gama){
                    sum1 -= delta;
                    r--;
                    count++;
                }else {
                    sum2 += gama;
                    l++;
                    count++;
                }

            }
        }
        else {
            int r = nums2.length - 1;
            int l = 0;

            while (sum2 > sum1){
                if (r < 0){
                    int gama = (6 - nums1[l]);
                    sum1 += gama;
                    l++;
                    count++;

                    if (gama == 0){
                        return -1;
                    }

                    continue;
                } else if (l >= nums1.length) {
                    int delta = nums2[r] - 1;
                    sum2 -= delta;
                    r--;
                    count++;

                    if (delta == 0){
                        return -1;
                    }

                    continue;
                }

                int delta = nums2[r] - 1;
                int gama = (6 - nums1[l]);

                if (delta == 0 && gama == 0){
                    return -1;
                }

                if (delta > gama){
                    sum2 -= delta;
                    r--;
                    count++;
                }else {
                    sum1 += gama;
                    l++;
                    count++;
                }


            }
        }

        return count;
    }

}
