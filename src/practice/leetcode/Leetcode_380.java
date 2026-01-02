package practice.leetcode;

// Insert Delete GetRandom O(1)
// https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.*;

public class Leetcode_380 {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(0);
        randomizedSet.insert(1);
        randomizedSet.remove(0);
        randomizedSet.insert(2);
        randomizedSet.remove(1);
        randomizedSet.getRandom();
    }

    static class RandomizedSet {
        private Map<Integer,Integer> map;
        private List<Integer> list;
        private Random random;
        private Integer index;

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
            index = 0;
        }

        public boolean insert(int val) {
            if (map.containsKey(val)){
                return false;
            }
            map.put(val,index++);
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)){
                return false;
            }
            Integer i = map.get(val);
            Integer temp = list.get(list.size() - 1);
            map.put(temp,i);
            list.set(i,temp);
            list.remove(list.size() - 1);
            map.remove(val);
            index--;
            return true;
        }

        public int getRandom() {
            int i = random.nextInt(list.size());
            return list.get(i);
        }
    }

}
