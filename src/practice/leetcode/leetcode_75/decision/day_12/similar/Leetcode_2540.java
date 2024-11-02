package practice.leetcode.leetcode_75.decision.day_12.similar;

// Minimum Common Value
// https://leetcode.com/problems/minimum-common-value/description/

public class Leetcode_2540 {

    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
        System.out.println(getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
       int i = 0;
       int j = 0;

       while (i < nums1.length && j < nums2.length){
           if (nums1[i] == nums2[j]){
               return nums1[i];
           }else if (nums1[i] < nums2[j]){
                i++;
           }else {
               j++;
           }
       }

       return -1;
    }

}
