package practice.leetcode.linkedList;

// Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class Leetcode_83 {

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
        ListNode listNode1 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, null))));
        while (listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
        ListNode listNode2 = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null))))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null){

            if (current.val == current.next.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }

        }

        return head;
    }


}
