package practice.leetcode.Intervals.medium;

// Meeting Rooms II
// https://neetcode.io/problems/meeting-schedule-ii

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode_253 {

    public static void main(String[] args) {
        System.out.println(minMeetingRooms(new ArrayList<>()));
    }

    public static class Interval {
        public int start, end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (Interval interval : intervals){
            if (!minHeap.isEmpty() && minHeap.peek() <= interval.start){
                minHeap.poll();
            }
            minHeap.add(interval.end);
        }

        return minHeap.size();
    }
}
