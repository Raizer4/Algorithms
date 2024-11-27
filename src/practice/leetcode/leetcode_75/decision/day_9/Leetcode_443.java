package practice.leetcode.leetcode_75.decision.day_9;

// String Compression
// https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75




public class Leetcode_443 {

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b' ,'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
       System.out.println(compress(new char[]{'a'}));
    }

    public static int compress(char[] chars) {
        int i = 0;
        int write = 0;

        while (i < chars.length){
            char aChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == aChar){
                count++;
                i++;
            }

            chars[write++] = aChar;

            if (count > 1){
                 for (char temp : String.valueOf(count).toCharArray()){
                     chars[write++] = temp;
                 }
            }
        }

        return write;
    }


}
