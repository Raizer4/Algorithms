package practice.leetcode.array.easy;

// Fruits Into Baskets II
// https://leetcode.com/problems/fruits-into-baskets-ii/description/

public class Leetcode_3477 {

    public static void main(String[] args) {
        System.out.println(numOfUnplacedFruits(new int[]{4,2,5}, new int[]{3,5,4}));
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int i = 0;

        int count = 0;

        while (i < n){
            for (int j = 0; j < n; j++) {
                if (baskets[j] >= fruits[i]){
                    baskets[j] = -1;
                    count++;
                    break;
                }
            }
            i++;
        }

        return n - count;
    }

}
