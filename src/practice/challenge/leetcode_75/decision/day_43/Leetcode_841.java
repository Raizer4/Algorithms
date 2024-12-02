package practice.challenge.leetcode_75.decision.day_43;

// Keys and Rooms
// https://leetcode.com/problems/keys-and-rooms/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        Set<Integer> set = new TreeSet<>();
        dfs(0,rooms, set);
        return size == set.size();
    }

    private static void dfs(int room,List<List<Integer>> rooms,Set<Integer> set){
        if (set.contains(room)){return;}
        set.add(room);
        for (Integer temp : rooms.get(room)){
            dfs(temp, rooms, set);
        }
    }




}


