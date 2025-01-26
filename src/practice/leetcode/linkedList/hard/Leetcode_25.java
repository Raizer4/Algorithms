package practice.leetcode.linkedList.hard;

// Reverse Nodes in k-Group
// https://leetcode.com/problems/reverse-nodes-in-k-group/description/

public class Leetcode_25 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5)))));

        ListNode res = reverseKGroup(listNode, 2);

        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode groupPrev = dummy;

        while (true){
            ListNode kth = getKth(groupPrev,k);
            if (kth == null){
                break;
            }
            ListNode groupNext = kth.next;

            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;

            while (curr != groupNext){
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            ListNode tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
        }

        return dummy.next;
    }

    private static ListNode getKth(ListNode curr, int k){
        while (curr != null && k > 0){
            curr = curr.next;
            k--;
        }
        return curr;
    }

}
