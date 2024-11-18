package practice.leetcode.leetcode_75.decision.day_28.similar;

// Design Front Middle Back Queue
// https://leetcode.com/problems/design-front-middle-back-queue/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1670 {

   static class FrontMiddleBackQueue {

       private List<Integer> list;

       public FrontMiddleBackQueue() {
           list = new ArrayList<>();
       }

       public void pushFront(int val) {
           list.add(0, val);
       }


       public void pushMiddle(int val) {
           list.add(list.size() / 2, val);
       }


       public void pushBack(int val) {
           list.add(val);
       }


       public int popFront() {
           if (list.isEmpty()) {
               return -1;
           }
           return list.remove(0);
       }


       public int popMiddle() {
           if (list.isEmpty()) {
               return -1;
           }
           int middleIndex = (list.size() - 1) / 2;
           return list.remove(middleIndex);
       }


       public int popBack() {
           if (list.isEmpty()) {
               return -1;
           }
           return list.remove(list.size() - 1);
       }

    }

    public static void main(String[] args) {
        FrontMiddleBackQueue q = new FrontMiddleBackQueue();

        q.pushFront(1); // [1]
        System.out.println("После pushFront(1): " + q); // Отобразим текущее состояние

        q.pushBack(2); // [1, 2]
        System.out.println("После pushBack(2): " + q);

        q.pushMiddle(3); // [1, 3, 2]
        System.out.println("После pushMiddle(3): " + q);

        q.pushMiddle(4); // [1, 4, 3, 2]
        System.out.println("После pushMiddle(4): " + q);

        System.out.println("popFront(): " + q.popFront()); // возвращает 1 -> [4, 3, 2]
        System.out.println("После popFront: " + q);

        System.out.println("popMiddle(): " + q.popMiddle()); // возвращает 3 -> [4, 2]
        System.out.println("После popMiddle: " + q);

        System.out.println("popMiddle(): " + q.popMiddle()); // возвращает 4 -> [2]
        System.out.println("После popMiddle: " + q);

        System.out.println("popBack(): " + q.popBack()); // возвращает 2 -> []
        System.out.println("После popBack: " + q);

        System.out.println("popFront(): " + q.popFront()); // возвращает -1 -> []
        System.out.println("После popFront: " + q);
    }

}
