package practice.leetcode.hash_table.easy;

// Decode the Message
// https://leetcode.com/problems/decode-the-message/description/

import java.util.HashMap;

public class Leetcode_2325 {

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        String[] s = key.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String temp : s){
            for (char c : temp.toCharArray()){
                if (stringBuilder.indexOf(String.valueOf(c)) == -1) {
                    stringBuilder.append(c);
                }
            }
        }

        int index = 0;
        for (int i = 97; i <= 122; i++){
            map.put(stringBuilder.charAt(index++),(char) i);
        }

        StringBuilder builder = new StringBuilder();

        for (Character temp : message.toCharArray()){
            if (temp == ' '){
                builder.append(" ");
            }else {
                builder.append(map.get(temp));
            }
        }

        return builder.toString();
    }

}
