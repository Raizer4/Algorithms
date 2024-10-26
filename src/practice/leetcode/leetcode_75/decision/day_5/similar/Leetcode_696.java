package practice.leetcode.leetcode_75.decision.day_5.similar;

// Count Binary Substrings
// https://leetcode.com/problems/count-binary-substrings/description/

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.List;

public class Leetcode_696 {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i - 1) != s.charAt(i)){
                list.add(count);
                count = 1;
            }else {
                count++;
            }
        }
        list.add(count);

        int result = 0;

        for (int i = 1; i < list.size(); i++) {
            result += Math.min(list.get(i - 1),list.get(i));
        }

        return result;
    }




}
