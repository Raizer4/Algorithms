package practice.leetcode.siliding_window.medium;

// Reschedule Meetings for Maximum Free Time I
// https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-i/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_3439 {

    public static void main(String[] args) {
        System.out.println(maxFreeTime(10, 1, new int[]{0,2,9}, new int[]{1,4,10}));
    }

    public static int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        List<Integer> list = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < startTime.length; i++) {
            list.add(startTime[i] - start);
            start = endTime[i];
        }

        if (endTime.length > 0) {
            list.add(eventTime - endTime[endTime.length - 1]);
        }else {
            list.add(eventTime);
        }

        int temp = 0;

        for (int i = 0; i < k + 1; i++) {
            temp += list.get(i);
        }

        int l = 0;

        int num = temp;

        for (int i = k + 1; i < list.size(); i++) {
            temp -= list.get(l++);
            temp += list.get(i);

            num = Math.max(num, temp);
        }

        return num;
    }

}
