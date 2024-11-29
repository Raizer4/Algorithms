package practice.challenge.leetcode_75;

// Keys and Rooms
// https://leetcode.com/problems/keys-and-rooms/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Leetcode_841 {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> temp_1 = new ArrayList<>();
        temp_1.add(1); // Ключ к комнате 1

        List<Integer> temp_2 = new ArrayList<>();
        temp_2.add(2); // Ключ к комнате 2

        List<Integer> temp_3 = new ArrayList<>();
        temp_3.add(3); // Ключ к комнате 3

        List<Integer> temp_4 = new ArrayList<>(); // Пустая комната

        list.add(temp_1); // Комната 0 содержит ключ к комнате 1
        list.add(temp_2); // Комната 1 содержит ключ к комнате 2
        list.add(temp_3); // Комната 2 содержит ключ к комнате 3
        list.add(temp_4); // Комната 3 не содержит ключей

        System.out.println(canVisitAllRooms(list));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> list = rooms.get(0);

        List<Integer> temp = new ArrayList<>();

        for (int i = 1; i < rooms.size(); i++) {
            temp.add(i);
        }

        int j = 0;

        while (j < list.size()) {
            int key = list.get(j);
            if (temp.contains(key)) {
                temp.remove(Integer.valueOf(key));
                list.addAll(rooms.get(key));
            }
            j++;
        }

        return temp.isEmpty();
    }
}


