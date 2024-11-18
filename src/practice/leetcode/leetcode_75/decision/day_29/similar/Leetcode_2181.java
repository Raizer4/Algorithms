package practice.leetcode.leetcode_75.decision.day_29.similar;

// Merge Nodes in Between Zeros
// https://leetcode.com/problems/merge-nodes-in-between-zeros/description/

public class Leetcode_2181 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(0,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(0,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));

        ListNode result = mergeNodes(head);
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode current = head;

        boolean flag = false;
        int count = 0;

        while (current != null) {
            if (current.val == 0 && flag) {
                ListNode listNode = new ListNode(count);
                temp.next = listNode;
                temp = listNode;
                count = 0;
            } else if (current.val == 0 && !flag) {
                flag = true;
            } else if (flag) {
                count += current.val;
            }
            current = current.next;
        }

        return dummy.next;
    }


}
