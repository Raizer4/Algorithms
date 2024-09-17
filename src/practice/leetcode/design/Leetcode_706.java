package practice.leetcode.design;

// Design HashMap
// https://leetcode.com/problems/design-hashmap/description/?envType=problem-list-v2&envId=design&difficulty=EASY

import java.util.LinkedList;

public class Leetcode_706 {

    static class MyHashMap {
        private static final int INITIAL_CAPACITY = 16;
        private LinkedList<Entry>[]buckets;

        private static class Entry{
            Integer key;
            Integer value;

            public Entry(Integer key, Integer value){
                this.key = key;
                this.value = value;
            }

        }


        public MyHashMap() {
            buckets = new LinkedList[INITIAL_CAPACITY];
        }

        public void put(int key, int value) {
            int bucketIndex = getBucketIndex(key);

            LinkedList<Entry> bucket = buckets[bucketIndex];

            if (bucket == null) {
                bucket = new LinkedList<>();
                buckets[bucketIndex] = bucket;
            }

            for (Entry temp : bucket){
                if (temp.key.equals(key)){
                    temp.value = value;
                    return;
                }
            }

            bucket.add(new Entry(key,value));
        }

        public int get(int key) {
            int bucketIndex = getBucketIndex(key);

            if (buckets[bucketIndex] == null){
                return -1;
            }

            for (Entry entry : buckets[bucketIndex]) {
                if (entry.key.equals(key)){
                    return entry.value;
                }
            }

            return -1;
        }

        public void remove(int key) {
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry> bucket = buckets[bucketIndex];

            if (bucket != null){
                bucket.removeIf(entry -> entry.key.equals(key));
            }

        }

        private int getBucketIndex(Integer key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }

    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1,1);
        map.put(2,2);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        map.put(2,1);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
    }

}
