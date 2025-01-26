package practice.leetcode.linkedList.medium;

// Copy List with Random Pointer
// https://leetcode.com/problems/copy-list-with-random-pointer/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_138 {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        Node copiedList = copyRandomList(node1);
    }

    public static Node copyRandomList(Node head) {
        Map<Node, Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null,null);

        Node current = head;
        while (current != null){
            Node copy = new Node(current.val);
            oldToCopy.put(current,copy);
            current = current.next;
        }

        current = head;
        while (current != null){
            Node copy = oldToCopy.get(current);
            copy.next = oldToCopy.get(current.next);
            copy.random = oldToCopy.get(current.random);
            current = current.next;
        }

        return oldToCopy.get(head);
    }

}
