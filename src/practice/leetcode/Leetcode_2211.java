package practice.leetcode;

// Count Collisions on a Road
// https://leetcode.com/problems/count-collisions-on-a-road/description/?envType=daily-question&envId=2025-12-04

public class Leetcode_2211 {

    public static void main(String[] args) {
        System.out.println(countCollisions("RLRSLL"));
    }

    public static int countCollisions(String directions) {
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'S' || directions.charAt(i) == 'R'){
                flag = true;
                continue;
            }

            if (flag){
                count++;
            }
        }

        flag = false;

        for (int i = directions.length() - 1; i >= 0; i--) {
            if (directions.charAt(i) == 'L' || directions.charAt(i) == 'S'){
                flag = true;
                continue;
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }

}
