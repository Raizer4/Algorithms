package practice.challenge.leetcode_75.decision.day_30.similar;

// Remove Nodes From Linked List
// https://leetcode.com/problems/remove-nodes-from-linked-list/submissions/1457572446/

public class Leetcode_2487 {

   static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = removeNodes(new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8))))));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode removeNodes(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }


        ListNode reversedHead = prev;

        current = reversedHead;

        while (current != null && current.next != null) {
            if (current.val > current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }


        current = reversedHead;

        prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
