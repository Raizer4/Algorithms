package practice.leetcode.linkedList;

// Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=problem-list-v2&envId=linked-list&difficulty=EASY

public class Leetcode_876 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode_1 = middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        ListNode listNode_2 = middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        while (listNode_1 != null){
            System.out.println(listNode_1.val);
            listNode_1 = listNode_1.next;
        }

        while (listNode_2 != null){
            System.out.println(listNode_2.val);
            listNode_2 = listNode_2.next;
        }

    }

    public static ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;

        while(current != null){
            count++;
            current = current.next;
        }

        int middle;

        if (count % 2 == 0){
            middle = (count + 1) / 2;
        }else {
            middle = (int) Math.ceil(count/2);
        }

        int k = 0;

        while (head != null){
            if (middle == k){
                return head;
            }
            k++;
            head = head.next;
        }

        return null;
    }

}
