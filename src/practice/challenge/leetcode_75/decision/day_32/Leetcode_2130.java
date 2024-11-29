package practice.challenge.leetcode_75.decision.day_32;

// Maximum Twin Sum of a Linked List
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2130 {

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println(pairSum(new ListNode(5,new ListNode(4,new ListNode(2,new ListNode(1))))));
    }

    public static int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode current = head;

        while (current != null){
            list.add(current.val);
            current = current.next;
        }

        int i = 0;
        int j = list.size() - 1;

        int max = 0;

        while (i < j){
            int temp = list.get(i) + list.get(j);
            max = Math.max(max,temp);
            i++;
            j--;
        }

        return max;
    }

}
