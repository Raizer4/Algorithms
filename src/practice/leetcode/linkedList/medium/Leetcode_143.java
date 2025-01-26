package practice.leetcode.linkedList.medium;

// Reorder List
// https://leetcode.com/problems/reorder-list/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_143 {

    public static class ListNode {
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
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        reorderList(listNode);
        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> list = new ArrayList<>();

        ListNode current = head;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = null;
            list.add(current);
            current = next;
        }

        ListNode node = head;

        int l = 0;
        int r = list.size() - 1;

        int tic = 0;

        while (l <= r){
            if (tic % 2 == 0){
                node.next = list.get(l++);
            }else {
                node.next = list.get(r--);
            }
            node = node.next;
            tic++;
        }

    }

}
