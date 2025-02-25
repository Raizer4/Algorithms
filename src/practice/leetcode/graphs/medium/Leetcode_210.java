package practice.leetcode.graphs.medium;

// Course Schedule II
// https://leetcode.com/problems/course-schedule-ii/description/

import java.util.*;

public class Leetcode_210 {

    public static void main(String[] args) {
        int[] order = findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});

        for (int temp : order){
            System.out.print(temp + " ");
        }

    }

    private static Map<Integer, List<Integer>> map = new HashMap<>();
    private static Set<Integer> visited = new TreeSet<>();

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int[] pair : prerequisites){
            map.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
        }

        List<Integer> output = new ArrayList<>();
        Set<Integer> cycle = new TreeSet<>();

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i,cycle, output)){
                return new int[0];
            }
        }

        int[] res = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            res[i] = output.get(i);
        }

        return res;
    }

    private static boolean dfs(int course, Set<Integer> cycle, List<Integer> output){
        if (cycle.contains(course)){
            return false;
        }

        if (visited.contains(course)){
            return true;
        }


        cycle.add(course);

        for (int pre : map.getOrDefault(course, Collections.emptyList())){
            if (!dfs(pre,cycle,output)){
                return false;
            }
        }

        cycle.remove(course);
        visited.add(course);
        output.add(course);

        return true;
    }

}
