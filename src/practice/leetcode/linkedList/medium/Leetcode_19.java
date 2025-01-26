package practice.leetcode.linkedList.medium;

// Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public class Leetcode_19 {

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
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNoderes = removeNthFromEnd(listNode, 2);

        while (listNoderes != null){
            System.out.print(listNoderes.val + " ");
            listNoderes = listNoderes.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;

        while (n > 0){
            right = right.next;
            n--;
        }

        while (right != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }

}
