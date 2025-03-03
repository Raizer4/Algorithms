package practice.leetcode.queue.medium;

// Design Circular Deque
// https://leetcode.com/problems/design-circular-deque/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_641 {

    static class MyCircularDeque {

        int k = 0;
        private List<Integer> list;

        public MyCircularDeque(int k) {
            list = new ArrayList<>();
            this.k = k;
        }

        public boolean insertFront(int value) {
            if (list.size() < k) {
                list.add(0, value);
                return true;
            }else {
                return false;
            }
        }

        public boolean insertLast(int value) {
            if (list.size() < k) {
                list.add(value);
                return true;
            }else {
                return false;
            }
        }

        public boolean deleteFront() {
            if (list.isEmpty()){
                return false;
            }else {
                list.remove(0);
                return true;
            }
        }

        public boolean deleteLast() {
            if (list.isEmpty()){
                return false;
            }else {
                list.remove(list.size() - 1);
                return true;
            }
        }

        public int getFront() {
            if (list.isEmpty()){
                return -1;
            }else {
                return list.get(0);
            }
        }

        public int getRear() {
            if (list.isEmpty()){
                return -1;
            }else {
                return list.get(list.size() - 1);
            }
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public boolean isFull() {
            return k == list.size();
        }
    }

    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        myCircularDeque.insertLast(1); // возвращает True
        myCircularDeque.insertLast(2); // возвращает True
        myCircularDeque.insertFront(3); // возвращает True
        myCircularDeque.insertFront(4); // возвращает False, очередь заполнена.
        myCircularDeque.getRear(); // возвращает 2
        myCircularDeque.isFull(); // возвращает True
        myCircularDeque.deleteLast(); // возвращает True
        myCircularDeque.insertFront(4); // возвращает True
        myCircularDeque.getFront(); // возвращает 4
    }

}
