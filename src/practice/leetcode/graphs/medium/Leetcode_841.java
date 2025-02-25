package practice.leetcode.graphs.medium;

// Keys and Rooms
// https://leetcode.com/problems/keys-and-rooms/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_841 {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> temp_1 = new ArrayList<>();
        temp_1.add(1);

        List<Integer> temp_2 = new ArrayList<>();
        temp_2.add(2);

        List<Integer> temp_3 = new ArrayList<>();
        temp_3.add(3);

        List<Integer> temp_4 = new ArrayList<>();

        list.add(temp_1);
        list.add(temp_2);
        list.add(temp_3);
        list.add(temp_4);

        System.out.println(canVisitAllRooms(list));
    }


    private static boolean[] visited;

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];

        dfs(0, rooms);

        for (boolean temp : visited){
            if (!temp){
                return false;
            }
        }

        return true;
    }

    private static void dfs(int key, List<List<Integer>> rooms){
        if (visited[key]){
            return;
        }

        visited[key] = true;

        for (Integer temp : rooms.get(key)){
            dfs(temp, rooms);
        }
    }


}


