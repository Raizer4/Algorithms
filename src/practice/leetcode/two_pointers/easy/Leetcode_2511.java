package practice.leetcode.two_pointers.easy;

// Maximum Enemy Forts That Can Be Captured
// https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/description/

public class Leetcode_2511 {

    public static void main(String[] args) {
        System.out.println(captureForts(new int[]{1,0,0,-1,0,0,-1,0,0,1}));
    }

    public static int captureForts(int[] forts) {
        int max = 0;

        int prev = -1;

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (prev != -1 && forts[prev] != forts[i]) {
                    int temp = 0;
                    boolean flag = true;

                    for (int j = prev + 1; j < i; j++){
                        if (forts[j] != 0){
                            flag = false;
                            break;
                        }
                        temp++;
                    }

                    if (flag){
                        max = Math.max(max, temp);
                    }
                }

                prev = i;
            }


        }

        return max;
    }

}
