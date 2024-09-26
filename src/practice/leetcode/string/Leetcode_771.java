package practice.leetcode.string;

// Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/description/

public class Leetcode_771 {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < jewels.length(); i++){
            char c = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++){
                if (stones.charAt(j) == c){
                    count++;
                }
            }
        }

        return count;
    }

}
