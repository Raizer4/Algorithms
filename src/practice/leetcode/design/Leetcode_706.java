package practice.leetcode.design;

// Design HashMap
// https://leetcode.com/problems/design-hashmap/description/?envType=problem-list-v2&envId=design&difficulty=EASY

import java.util.LinkedList;

public class Leetcode_706 {

    static class MyHashMap {
        private static final Integer MAX_VALUE = 16;
        LinkedList<Entry>[] buckets;

        public class Entry {
            Integer key;
            Integer value;

            public Entry(Integer key, Integer value) {
                this.key = key;
                this.value = value;
            }
        }

        public MyHashMap() {
            buckets = new LinkedList[MAX_VALUE];
        }

        public void put(int key, int value) {
            int bucketIndex = getBucketIndex(key);

            LinkedList<Entry> bucket = buckets[bucketIndex];

            if (bucket == null){
               bucket = new LinkedList<>();
               buckets[bucketIndex] = bucket;
            }

            for (Entry entry : bucket) {
                if (entry.key.equals(key)){
                    entry.value = value;
                    return;
                }
            }

            bucket.add(new Entry(key,value));
        }

        public int get(int key) {
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry> bucket = buckets[bucketIndex];

            if (bucket == null){
                return -1;
            }

            for (Entry entry : bucket){
                if (entry.key == key){
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

        private int getBucketIndex(Integer key){
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
