package practice.leetcode.two_pointers.medium;

// Maximum Matching of Players With Trainers
// https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/

import java.util.Arrays;

public class Leetcode_2410 {

    public static void main(String[] args) {
        System.out.println(matchPlayersAndTrainers(new int[]{4,7,9}, new int[]{8,2,5,8}));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        int j = 0;

        int count = 0;

        while (i < players.length && j < trainers.length){
            if (players[i] <= trainers[j]){
                i++;
                j++;
                count++;
            }else {
                j++;
            }
        }


        return count;
    }

}
