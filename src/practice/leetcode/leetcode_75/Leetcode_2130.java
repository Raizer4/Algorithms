package practice.leetcode.leetcode_75;

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

        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        int max = 0;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (i >= (n / 2) - 1){
                int temp = list.get(i) + list.get(n - 1 - i);
                if (max < temp){
                    max = temp;
                }
            }
        }

        return max;
    }

}
