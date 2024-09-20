package practice.leetcode.leetcode_75.day_1;

// Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_605 {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1){
            if (flowerbed[0] == 0 && n == 1){
                return true;
            }else {
                return false;
            }
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }

        for (int i = 1; i < flowerbed.length -1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }

        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length-2] == 0){
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }

        return n <= 0;
    }

}
