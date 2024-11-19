package practice.leetcode.leetcode_75.decision.day_30;

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
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        ListNode oddList = dummy;

        ListNode dummi = new ListNode(0);
        ListNode even = dummi;

        ListNode current = head;

        int index = 0;

        while (current != null) {
            if (index % 2 == 0) {
                ListNode node = new ListNode(current.val);
                even.next = node;
                even = node;
            } else {
                ListNode node = new ListNode(current.val);
                oddList.next = node;
                oddList = node;
            }
            current = current.next;
            index++;
        }



        even.next = null;
        even.next = dummy.next;

        return dummi.next;
    }

}
