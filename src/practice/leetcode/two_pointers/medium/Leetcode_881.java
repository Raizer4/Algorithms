package practice.leetcode.two_pointers.medium;

// Boats to Save People
// https://leetcode.com/problems/boats-to-save-people/description/

import java.util.Arrays;

public class Leetcode_881 {

    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1,3,4,3,3,5}, 5));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;
        int count = 0;

        while (l <= r){
            if (people[l] + people[r] <= limit){
                l++;
            }
            r--;
            count++;
        }

        return count;
    }


}
