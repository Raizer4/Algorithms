package practice.leetcode.design.easy;

// Design HashSet
// https://leetcode.com/problems/design-hashset/description/?envType=problem-list-v2&envId=design&difficulty=EASY

public class Leetcode_705 {

    static class MyHashSet {
        ListNode head = new ListNode();

        public static class ListNode {
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


        public void add(int key) {
            if (!contains(key)) {
                ListNode currency = head;

                while (currency.next != null) {
                    currency = currency.next;
                }

                currency.next = new ListNode(key);
            }
        }

        public boolean contains(int key) {
            ListNode currency = head.next;

            while (currency != null) {
                if (currency.val == key) {
                    return true;
                }
                currency = currency.next;
            }

            return false;
        }

        public void remove(int key) {
            ListNode currency = head;

            while(currency != null && currency.next != null){
                if (currency.next.val == key){
                    currency.next = currency.next.next;
                }else{
                    currency = currency.next;
                }
            }

        }

    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(3)); // false
        set.add(2);
        System.out.println(set.contains(2)); // true
        set.remove(2);
        System.out.println(set.contains(2)); // false
    }

}
