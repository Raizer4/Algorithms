package practice.leetcode;

// Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_496 {

    public static void main(String[] args) {
        int[] ints = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});

        for (int temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for (int temp : nums2){
            list.add(temp);
        }

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++){
            int i1 = list.indexOf(nums1[i]);
            int i2 = i1 + 1;
            boolean flag = true;

            if (i1 != -1 && i2 < nums2.length){
                while (i2 < nums2.length){
                    if (nums1[i] < nums2[i2]){
                        integerList.add(nums2[i2]);
                        flag = false;
                        break;
                    }
                    i2++;
                }
            }else {
                integerList.add(-1);
                flag = false;
            }

            if (flag){
                integerList.add(-1);
            }

        }

        int[] ints = new int[integerList.size()];

        for (int i = 0; i < integerList.size(); i++){
            ints[i] = integerList.get(i);
        }

        return ints;
    }

}
