package practice.leetcode.leetcode_75.day_3;

// Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/description/

public class Leetcode_206 {

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
        ListNode listNode = reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))));

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
        ListNode currency = head;

        while(currency != null){
            next = currency.next;
            currency.next = prev;
            prev = currency;
            currency = next;
        }

        return prev;
    }

}
