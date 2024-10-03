package practice.leetcode.design.easy;

// Design an Ordered Stream
// https://leetcode.com/problems/design-an-ordered-stream/description/

import java.util.*;

public class Leetcode_1656 {

    static class OrderedStream {
        int i = 1;
        List<String> list;
        List<Integer> keys;

        public OrderedStream(int n) {
           list = new ArrayList<>(n);
           keys = new ArrayList<>(n);
        }

        public List<String> insert(int idKey, String value) {
            List<String> result = new ArrayList<>();

            list.add(value);
            keys.add(idKey);

            while (keys.contains(i)){
                int index = keys.indexOf(i);
                result.add(list.get(index));
                i++;
            }

            return result;
        }

    }

    public static void main(String[] args) {
        OrderedStream stream = new OrderedStream(5);

        System.out.println(stream.insert(3,"ccccc"));
        System.out.println(stream.insert(1, "aaaaa"));
        System.out.println(stream.insert(2, "bbbbb"));
        System.out.println(stream.insert(5, "eeeee"));
        System.out.println(stream.insert(4, "ddddd"));


    }

}
