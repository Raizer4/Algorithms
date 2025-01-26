package practice.leetcode.linkedList.hard;

// Merge k Sorted Lists
// https://leetcode.com/problems/merge-k-sorted-lists/description/

public class Leetcode_23 {

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
        ListNode temp1 = new ListNode(1,new ListNode(2));
        ListNode temp2 = new ListNode(3,new ListNode(4));
        ListNode temp3 = new ListNode(5,new ListNode(6));

        ListNode[] arr = new ListNode[]{temp1,temp2,temp3};

        ListNode listNode = mergeKLists(arr);

        while (listNode != null){
            System.out.println(listNode.val + " ");
            listNode = listNode.next;
        }

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }

        for (int i = 1; i < lists.length; i++){
            lists[i] = merge(lists[i],lists[i - 1]);
        }

        return lists[lists.length - 1];
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null){

            if (l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
            }else {
                curr.next = l1;
                l1 = l1.next;
            }

            curr = curr.next;
        }


        if (l1 != null){
            curr.next = l1;
        }else {
            curr.next = l2;
        }

        return dummy.next;
    }

}
