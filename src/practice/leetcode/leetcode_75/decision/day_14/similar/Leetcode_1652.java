package practice.leetcode.leetcode_75.decision.day_14.similar;

// Defuse the Bomb
// https://leetcode.com/problems/defuse-the-bomb/description/

public class Leetcode_1652 {

    public static void main(String[] args) {
        int[] decrypt1 = decrypt(new int[]{5, 7, 1, 4}, 3);
        int[] decrypt2 = decrypt(new int[]{1, 2, 3, 4}, 0);
        int[] decrypt3 = decrypt(new int[]{2, 4, 9, 3}, -2);

        for (int temp : decrypt1){
            System.out.print(temp + " ");
        }

        System.out.println();

        for (int temp : decrypt2){
            System.out.print(temp + " ");
        }

        System.out.println();

        for (int temp : decrypt3){
            System.out.print(temp + " ");
        }

    }

    public static int[] decrypt(int[] code, int k) {
        int[] result;

        if (k > 0){
            result = positive(code,k);
        }else if (k < 0){
            result = negative(code,k);
        }else {
            result = zero(code,k);
        }

        return result;
    }

    private static int[] positive(int[] code, int k){
        int[] res = new int[code.length];

        int index = 0;
        int i = 0;
        int counter = 0;

        while (index < code.length){
            i = index + 1;
            int sum = 0;

            while (counter < k){
                if (i >= code.length){
                    i = 0;
                }
                sum += code[i++];
                counter++;
            }

            res[index++] = sum;
            counter = 0;
        }

        return res;
    }

    private static int[] negative(int[] code, int k){
        int[] res = new int[code.length];

        int index = 0;
        int i = 0;
        int counter = 0;

        while (index < code.length){
            i = index - 1;
            int sum = 0;

            while (counter < Math.abs(k)){
                if (i < 0){
                    i = code.length - 1;
                }
                sum += code[i--];
                counter++;
            }

            res[index++] = sum;
            counter = 0;
        }

        return res;
    }

    private static int[] zero(int[] code, int k){
        int[] res = new int[code.length];

        for (int i = 0; i < code.length; i++){
            res[i] = 0;
        }

        return res;
    }

}
