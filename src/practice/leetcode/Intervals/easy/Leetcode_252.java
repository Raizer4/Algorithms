package practice.leetcode.Intervals.easy;

// Meeting Rooms
// https://neetcode.io/problems/meeting-schedule

import java.util.ArrayList;
import java.util.List;

public class Leetcode_252 {

    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new ArrayList<>()));
    }

    public static class Interval {
        public int start, end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

    }

    public static boolean canAttendMeetings(List<Interval> intervals) {
        Interval interval = intervals.get(0);
        int prevStart = interval.start;
        int prevEnd = interval.end;

        if (intervals.size() == 1){
            return true;
        }

        for (int i = 1; i < intervals.size(); i++) {
            Interval temp = intervals.get(i);

            int nextStart = temp.start;
            int nextEnd = temp.end;

            if (nextStart > prevStart && nextStart < prevEnd){
                return false;
            }

            if (nextEnd > prevStart && nextEnd < prevEnd){
                return false;
            }

            prevStart = Math.min(prevStart, nextStart);
            prevEnd = Math.max(prevEnd, nextEnd);
        }


        return true;
    }

}
