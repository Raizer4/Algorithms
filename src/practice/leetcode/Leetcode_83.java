package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_83 {

    static class ListNode {
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
        ListNode listNode1 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, null))));
        while (listNode1.next != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
        ListNode listNode2 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null))))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        List<Integer> list = new ArrayList<>();

        while (head.next != null){
           if (!list.contains(head.val)){
               list.add(head.val);
               current.next = head.next;
               current = current.next;
           }
           head = head.next;
        }

        return dummy.next;
    }


}
