package practice.leetcode.array.easy;

// Find Common Elements Between Two Arrays
// https://leetcode.com/problems/find-common-elements-between-two-arrays/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2956 {

    public static void main(String[] args) {
        int[] intersectionValues = findIntersectionValues(new int[]{4, 3, 2, 3, 1}, new int[]{2, 2, 5, 2, 3, 6});

        for (int temp : intersectionValues){
            System.out.println(temp);
        }
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        int answer1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                answer1++;
            }
        }


        int answer2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }

}
