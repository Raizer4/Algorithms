package practice.leetcode.design.medium;

// Time Based Key-Value Store
// https://leetcode.com/problems/time-based-key-value-store/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_981 {

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1); // сохраняем ключ "foo" и значение "bar" вместе со временем создания = 1.
        timeMap.get("foo", 1); // возвращает "bar"
        timeMap.get("foo", 3); // возвращает "bar", так как нет значения, соответствующего foo, для метки времени 3 и метки времени 2, поэтому единственное значение для метки времени 1 — "bar".
        timeMap.set("foo", "bar2", 4); // сохраняем ключ "foo" и значение "bar2" вместе со временем создания = 4.
        timeMap.get("foo", 4); // возвращает "bar2"
        timeMap.get("foo", 5); // возвращает "bar2"
    }

    public static class TimeMap {

        private Map<String, List<Pair<Integer, String>>> keyStore;

        public TimeMap() {
            keyStore = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            keyStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
        }

        public String get(String key, int timestamp) {
            List<Pair<Integer, String>> values = keyStore.getOrDefault(key, new ArrayList<>());
            int left = 0, right = values.size() - 1;
            String result = "";

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (values.get(mid).getKey() <= timestamp) {
                    result = values.get(mid).getValue();
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return result;
        }

        private static class Pair<K, V> {
            private final K key;
            private final V value;

            public Pair(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K getKey() {
                return key;
            }

            public V getValue() {
                return value;
            }
        }
    }

}
