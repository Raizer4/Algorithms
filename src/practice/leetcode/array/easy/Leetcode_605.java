package practice.leetcode.array.easy;

// Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_605 {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++){
            if (i == 0) {
                boolean prev = (i == 0 || flowerbed[i - 1] == 0);
                boolean next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (prev && next) {
                    flowerbed[i] = 1;
                    n--;
                }

                if (n == 0) {
                    return true;
                }
            }
        }


        return n <= 0;
    }

}
