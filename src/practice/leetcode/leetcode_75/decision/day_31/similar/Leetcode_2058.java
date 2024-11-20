package practice.leetcode.leetcode_75.decision.day_31.similar;

// Find the Minimum and Maximum Number of Nodes Between Critical Points
// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/

import java.util.*;

public class Leetcode_2058 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        int[] listNode = nodesBetweenCriticalPoints(new ListNode(5, new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(1, new ListNode(2, null))))))));

        for (int temp : listNode){
            System.out.println(temp);
        }
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> minList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();

        ListNode current = head;
        int prev = 0;

        int i = 0;

        while (current.next != null){
            if (i != 0){
                if (prev < current.val && current.val > current.next.val){
                    maxList.add(i + 1);
                }else if (prev > current.val && current.val < current.next.val){
                    minList.add(i + 1);
                }
            }
            prev = current.val;
            current = current.next;
            i++;
        }

        if (minList.size() + maxList.size() < 2){
            return new int[]{-1,-1};
        }else {
            return new int[] {minGap(maxList,minList), maxGap(maxList,minList)};
        }

    }


    private static int maxGap (List<Integer> list_1, List<Integer> list_2){
        List<Integer> res = new ArrayList<>();

        res.addAll(list_1);
        res.addAll(list_2);

        Collections.sort(res);

        int temp = res.get(res.size() - 1) - res.get(0);

        return temp;
    }

    private static int minGap (List<Integer> list_1, List<Integer> list_2){
        List<Integer> res = new ArrayList<>();

        res.addAll(list_1);
        res.addAll(list_2);

        Collections.sort(res);

        int min = Integer.MAX_VALUE;

        for (int i = res.size() - 1; i >= 1; i--){
            int temp = (res.get(i) - res.get(i - 1));
            min = Math.min(temp,min);
        }

        return min;
    }


}


