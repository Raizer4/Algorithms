package practice.leetcode.graphs.medium;

// Course Schedule
// https://leetcode.com/problems/course-schedule/description/


import java.util.*;

public class Leetcode_207 {

    public static void main(String[] args) {
        System.out.println(canFinish(5, new int[][]{{1,4},{5,2}}));
    }

    private static Map<Integer, List<Integer>> map = new HashMap<>();
    private static Set<Integer> visiting = new HashSet<>();

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            map.get(prereq[0]).add(prereq[1]);
        }

        for (int i = 0; i < numCourses; i++){
            dfs(i);
        }

        for (int c = 0; c < numCourses; c++) {
            if (!dfs(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean dfs(int num){
        if (visiting.contains(num)) {
            return false;
        }

        if (map.get(num).isEmpty()){
            return true;
        }

        visiting.add(num);

        for (Integer temp : map.get(num)){
            if (!dfs(temp)){
                return false;
            }
        }

        visiting.remove(num);
        map.put(num, new ArrayList<>());
        return true;
    }

}
