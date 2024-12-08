package practice.leetcode.string.medium;

// Encode and Decode Strings
// https://neetcode.io/problems/string-encode-and-decode

import java.util.ArrayList;
import java.util.List;

public class Leetcode_271 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("neet");
        list.add("code");
        list.add("love");
        list.add("you");

        decode(encode(list));
    }

    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String temp : strs){
            builder.append(temp.length());
            builder.append("#");
            builder.append(temp);
        }

        return builder.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();

         int i = 0;

         while (i < str.length()){
            int j = str.indexOf("#", i);

            if (j == -1) break;

            int length = Integer.parseInt(str.substring(i, j));

            String temp = str.substring(j + 1, j + 1 + length);

            list.add(temp);

            i = j + 1 + length;
         }

         return list;
    }


}
