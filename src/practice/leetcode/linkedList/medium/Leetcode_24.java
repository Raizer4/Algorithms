package practice.leetcode.linkedList.medium;

// Swap Nodes in Pairs
// https://leetcode.com/problems/swap-nodes-in-pairs/description/

public class Leetcode_24 {

    static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
      ListNode listNode = swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
      while (listNode != null) {
        System.out.println(listNode.val);
        listNode = listNode.next;
      }
    }

    public static ListNode swapPairs(ListNode head) {
      ListNode dummy = new ListNode(0);

      dummy.next = head;
      ListNode prev = dummy;

      while (prev.next != null && prev.next.next != null) {
        ListNode first = prev.next;
        ListNode second = prev.next.next;

        first.next = second.next;
        second.next = first;

        prev.next = second;
        prev = first;
      }

      return dummy.next;
    }

}
