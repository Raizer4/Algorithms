package practice.leetcode.queue.easy;

// First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/description/

import java.util.*;

public class Leetcode_387 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar(
                "aabb"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Character> list = new LinkedList<>();
        List<Character> blacList = new ArrayList<>();

        int i = 0;

        for (Character temp : s.toCharArray()){
            if (!list.contains(temp) && !blacList.contains(temp)){
                list.add(temp);
            }else {
                list.remove(temp);
                blacList.add(temp);
            }
            map.put(temp,i++);
        }


        if (list.isEmpty()){
            return -1;
        }else {
           return map.get(list.poll());
        }

    }

}
