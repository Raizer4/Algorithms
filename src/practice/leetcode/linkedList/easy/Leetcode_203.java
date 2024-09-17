package practice.leetcode.linkedList.easy;

// Remove Linked List Elements
// https://leetcode.com/problems/remove-linked-list-elements/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY


public class Leetcode_203 {

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
        ListNode listNode = removeElements(new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))))), 6);

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


    public static ListNode removeElements(ListNode head, int val) {
       while(head != null && head.val == val){
           head = head.next;
       }

       ListNode currency = head;

       while (currency != null && currency.next != null){
           if (currency.next.val == val){
               currency.next = currency.next.next;
           }else {
               currency = currency.next;
           }
       }


       return head;
    }



}
