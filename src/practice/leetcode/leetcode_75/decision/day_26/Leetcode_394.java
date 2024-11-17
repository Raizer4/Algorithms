package practice.leetcode.leetcode_75.decision.day_26;

// Decode String
// https://leetcode.com/problems/decode-string/submissions/1400731887/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class Leetcode_394 {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a] 2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    public static String decodeString(String s) {
        List decode = decode(s, 0);
        String s1 = (String) decode.get(0);
        return s1.replaceAll(" ","");
    }

    private static List decode(String s, int index){
        String tempInt = "";
        String tempStr = "";

        for (int i = index; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                tempInt += String.valueOf(s.charAt(i));
            } else if (s.charAt(i) == '[') {
                List decode = decode(s, i + 1);
                for (int j = 0; j < Integer.parseInt(tempInt); j++) {
                    tempStr += (String) decode.get(0);
                }
                i = (Integer) decode.get(1);
                tempInt = "";
            } else if (s.charAt(i) == ']') {
                List res = new ArrayList();
                res.add(tempStr);
                res.add(i);
                return res;
            } else {
                tempStr += String.valueOf(s.charAt(i));
            }

        }

        List list = new ArrayList();
        list.add(tempStr);
        return list;
    }

}
