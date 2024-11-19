package practice.leetcode.leetcode_75.decision.day_29.similar;

// Delete Node in a Linked List
// https://leetcode.com/problems/delete-node-in-a-linked-list/description/

public class Leetcode_237 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        deleteNode(new ListNode(1).next = new ListNode(5));
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node = node.next.next;
    }

}
