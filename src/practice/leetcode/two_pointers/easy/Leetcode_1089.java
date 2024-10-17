package practice.leetcode.two_pointers.easy;

// Duplicate Zeros
// https://leetcode.com/problems/duplicate-zeros/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1089 {

    public static void main(String[] args) {
        duplicateZeros(new int[]{0,0,0,0,0,0,0});
    }

    public static void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int j = 0;

        for (int i = 0; i <= arr.length - j; i++){
           if (arr[i] == 0){
               list.add(0);
               list.add(0);
               j++;
           }else {
               list.add(arr[i]);
           }
        }

        int size = list.size();

        if (list.size() > arr.length){
            size = arr.length;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }


    }

}
