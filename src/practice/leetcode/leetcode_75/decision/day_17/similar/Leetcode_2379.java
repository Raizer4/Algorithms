package practice.leetcode.leetcode_75.decision.day_17.similar;

// Minimum Recolors to Get K Consecutive Black Blocks
// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/

public class Leetcode_2379 {

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW",7));
        System.out.println(minimumRecolors("WBWBBBW",2));
    }

    public static int minimumRecolors(String blocks, int k) {
        int i = 0;
        int temp = k;
        int max = 0;

        while (k <= blocks.length()){
            int black = recolorsCounting(blocks.substring(i, k));
            if (black == temp){
                return 0;
            }
            max = Math.max(max,black);
            i++;
            k++;
        }

        return temp - max;
    }

    private static int recolorsCounting(String str){
        int b = 0;

        for (char temp : str.toCharArray()){
            if (temp == 'B'){
                b++;
            }
        }

        return b;
    }

}
