package practice.leetcode.two_pointers.medium;

// Pancake Sorting
// https://leetcode.com/problems/pancake-sorting/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_969 {

    public static void main(String[] args) {
        System.out.println(pancakeSort(new int[]{3,2,4,1}));
    }

    public static List<Integer> pancakeSort(int[] arr) {
        int[] array = new int[arr.length];
        int i = 0;
        for (int temp : arr) {
            array[i++] = temp;
        }
        Arrays.sort(array);
        i = arr.length - 1;

        int gran = arr.length - 1;

        if (Arrays.equals(array,arr)){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();

        while (gran >= 1){
            if (arr[0] == array[i]){
                int l = 0;
                int r = gran;

                list.add(r + 1);

                while (l <= r){
                    int temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;
                    l++;
                    r--;
                }

                gran--;
                i--;
            }else {
                int l = 0;
                int r = -1;

                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] == array[i]){
                        r = j;
                        break;
                    }
                }

                list.add(r + 1);

                while (l <= r){
                    int temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;
                    l++;
                    r--;
                }

            }

            if (Arrays.equals(array,arr)){
                break;
            }

        }



        return list;
    }


}
