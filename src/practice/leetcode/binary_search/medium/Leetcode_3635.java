package practice.leetcode.binary_search.medium;

// Earliest Finish Time for Land and Water Rides II
// https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_3635 {

    public static void main(String[] args) {
        System.out.println(earliestFinishTime(new int[]{76, 34}, new int[]{78, 64}, new int[]{30, 55, 73}, new int[]{22, 82, 21}));
        System.out.println(earliestFinishTime(new int[]{5}, new int[]{3}, new int[]{1}, new int[]{10}));
        System.out.println(earliestFinishTime(new int[]{80,71}, new int[]{27,47}, new int[]{45,3,64,7,25,45,6}, new int[]{40,39,66,64,24,74,49}));
        System.out.println(earliestFinishTime(new int[]{47,10,5,74,24}, new int[]{70,66,11,50,62}, new int[]{98,77,54,27,41,17,48,54}, new int[]{45,49,53,49,8,38,8,44}));
    }

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        List<int[]> ints = sorting(landStartTime, landDuration);
        List<int[]> list = sorting(waterStartTime, waterDuration);

        List<int[]> arr_1 = new ArrayList<>();
        List<int[]> arrayList_1 = new ArrayList<>();
        List<int[]> massiv_1 = new ArrayList<>();

        List<int[]> arr_2 = new ArrayList<>();
        List<int[]> arrayList_2 = new ArrayList<>();
        List<int[]> massiv_2 = new ArrayList<>();

        isField(ints, arr_1, arrayList_1, massiv_1);
        isField(list, arr_2, arrayList_2, massiv_2);

        int answwer = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int temp = (landStartTime[i] + landDuration[i]);

            if (isValid(arrayList_2, landStartTime[i])) {
                answwer = Math.min(answwer, temp);
            } else {
                int dsa = Integer.MAX_VALUE;

                if (massiv_2.get(massiv_2.size() - 1)[0] > temp) {
                    dsa = massiv_2.get(massiv_2.size() -1)[0];
                }

                int nefr = cheking(arr_2, temp);

                if (nefr != -1){
                    answwer = Math.min((temp + Math.min(dsa, nefr)), answwer);
                }else {
                    answwer = Math.min(dsa,answwer);
                }

            }
        }

        for (int i = 0; i < list.size(); i++) {
            int temp = (waterStartTime[i] + waterDuration[i]);

            if (isValid(arrayList_1, waterStartTime[i])){
                answwer = Math.min(answwer, temp);
            }else {
                int dsa = Integer.MAX_VALUE;

                if (massiv_1.get(massiv_1.size() - 1)[0] > temp) {
                    dsa = massiv_1.get(massiv_1.size() - 1)[0];
                }

                int nefr = cheking(arr_1, temp);

                if (nefr != -1){
                    answwer = Math.min((temp + Math.min(dsa,nefr)),answwer);
                }else {
                    answwer = Math.min(temp + dsa,answwer);
                }
            }

        }

        return answwer;
    }

    private static int cheking(List<int[]> list, int num){
        int l = 0;
        int r = list.size() - 1;

        int answer = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (list.get(m)[0] > num){
                r = m - 1;
            }else {
                answer = list.get(m)[1];
                l = m + 1;
            }

        }

        return answer;
    }

    private static boolean isValid(List<int[]> arr, int num){
        int l = 0;
        int r = arr.size() - 1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (arr.get(m)[1] <= num){
                return true;
            }else {
                r = m - 1;
            }

        }

        return false;
    }

    private static void isField(List<int[]> arr_1, List<int[]> arr_2, List<int[]> arr_3, List<int[]> arr_4){
        int num = Integer.MAX_VALUE;
        int integer = Integer.MAX_VALUE;
        int value = Integer.MAX_VALUE;
        int naga = -1;

        for (int[] temp : arr_1){
            num = Math.min(num, temp[1]);
            integer = Math.min(integer, temp[0] + temp[1]);

            int nef = (num + (temp[0] + temp[1]));
            value = Math.min(value, nef);

            if (value == nef){
                naga = (temp[0] + temp[1]);
            }

            arr_2.add(new int[]{temp[0], num});
            arr_3.add(new int[]{num, integer});
            arr_4.add(new int[]{naga, value});
        }
    }

    private static List<int[]> sorting(int[] arr_1, int[] arr_2){
        List<int[]> temp = new ArrayList<>();

        for (int i = 0; i < arr_1.length; i++) {
            temp.add(new int[]{arr_1[i], arr_2[i]});
        }

        Collections.sort(temp, (a,b) -> a[0] - b[0]);

        return temp;
    }

}
