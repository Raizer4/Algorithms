package practice.leetcode.leetcode_75.decision.day_31.similar;

// Swapping Nodes in a Linked List
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1721 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = swapNodes(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))),2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode current = head;

        List<Integer> list = new ArrayList<>();

        while (current != null){
            list.add(current.val);
            current = current.next;
        }

        int indexFirst = k - 1;
        Integer first = list.get(indexFirst);

        int indexSecond = list.size() - k;
        Integer second = list.get(indexSecond);

        list.set(indexSecond,first);
        list.set(indexFirst,second);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for (int i = 0; i < list.size(); i++){
            ListNode listNode = new ListNode(list.get(i));
            cur.next = listNode;
            cur = listNode;
        }

        return dummy.next;
    }

}
