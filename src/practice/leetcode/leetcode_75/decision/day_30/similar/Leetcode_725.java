package practice.leetcode.leetcode_75.decision.day_30.similar;

// Split Linked List in Parts
// https://leetcode.com/problems/split-linked-list-in-parts/description/

public class Leetcode_725 {

    static public class ListNode {
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
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode[] arr = splitListToParts(node,3);

        for (ListNode temp : arr){
            System.out.println(temp);
        }
    }

    public static ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;

        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }


        int partSize = count / k;
        int extraNodes = count % k;


        ListNode[] res = new ListNode[k];

        current = head;


        for (int i = 0; i < k; i++) {
            res[i] = current;

            int currentPartSize = partSize + (extraNodes > 0 ? 1 : 0);
            extraNodes--;

            for (int j = 1; j < currentPartSize && current != null; j++) {
                current = current.next;
            }

            if (current != null) {
                ListNode nextPart = current.next;
                current.next = null;
                current = nextPart;
            }
        }

        return res;
    }

}
