package practice.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

// Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/description/

public class Leetcode_1773 {

    public static void main(String[] args) {
        List<List<String>> base = new ArrayList<>();

        List<String> list_1 = new ArrayList<>();
        list_1.add("phone");
        list_1.add("blue");
        list_1.add("pixel");

        ArrayList<String> list_2 = new ArrayList<>();
        list_2.add("computer");
        list_2.add("silver");
        list_2.add("lenovo");

        ArrayList<String> list_3 = new ArrayList<>();
        list_3.add("phone");
        list_3.add("gold");
        list_3.add("iphone");

        base.add(list_1);
        base.add(list_2);
        base.add(list_3);


        System.out.println(countMatches(base,"color","silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int code;
        int count = 0;

        if (ruleKey.equals("type")){
            code = 0;
        }else if (ruleKey.equals("color")){
            code = 1;
        }else {
            code = 2;
        }


        for (List<String> temp : items){
            if (temp.get(code).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }

}
