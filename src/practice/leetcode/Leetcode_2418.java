package practice.leetcode;

// Sort the People
// https://leetcode.com/problems/sort-the-people/description/

import java.util.*;

public class Leetcode_2418 {

    public static void main(String[] args) {
        String[] strings = sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
        for (String temp : strings){
            System.out.println(temp);
        }
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i< names.length; i++){
            list.add(new Person(names[i],heights[i]));
        }

         Collections.sort(list,(a,b) -> b.heights - a.heights);

        String[] strings = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            strings[i] = list.get(i).name;
        }

        return strings;
    }

    private static class Person {
        String name;
        Integer heights;

        public Person(String name, Integer heights) {
            this.name = name;
            this.heights = heights;
        }
    }

}
