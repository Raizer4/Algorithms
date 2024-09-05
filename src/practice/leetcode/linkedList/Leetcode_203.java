package practice.leetcode.linkedList;

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
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while(current != null && current.next != null){

            if (current.next.val == val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }

        }

        return head;
    }



}
