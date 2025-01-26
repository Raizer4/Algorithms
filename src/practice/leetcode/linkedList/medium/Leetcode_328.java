package practice.leetcode.linkedList.medium;

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
        if (head == null){
            return null;
        }else if (head.next == null){
            return head;
        }

        ListNode dummh = new ListNode(0);
        ListNode dumm = new ListNode(0);

        ListNode even = dummh;
        ListNode odd = dumm;

        int index = 0;

        ListNode current = head;

        while (current != null){

            if (index % 2 == 0){
                ListNode node = new ListNode(current.val);
                even.next = node;
                even = node;
            }else {
                ListNode node = new ListNode(current.val);
                odd.next = node;
                odd = node;
            }

            current = current.next;
            index++;
        }

        ListNode next = dummh.next;

        ListNode cur = next;

        while (cur.next != null){
            cur = cur.next;
        }

        cur.next = dumm.next;

        return next;
    }

}
