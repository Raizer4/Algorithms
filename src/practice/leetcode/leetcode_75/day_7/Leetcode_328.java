package practice.leetcode.leetcode_75.day_7;

// Odd Even Linked List
// https://leetcode.com/problems/odd-even-linked-list/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_328 {

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode listNode = oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

}
