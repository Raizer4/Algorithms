package practice.leetcode.dynamic_programming.easy;

// Pascal's Triangle II
// https://leetcode.com/problems/pascals-triangle-ii/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_119 {

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> base = new ArrayList<>();

        List<Integer> templist = new ArrayList<>();
        templist.add(1);
        base.add(templist);

        if (rowIndex == 0){
            return templist;
        }

        for (int i = 1; i < rowIndex; i++) {
            List<Integer> prevlist = base.get(i - 1);
            List<Integer> extendlist = new ArrayList<>();


            List<Integer> next = new ArrayList<>();
            next.add(0);
            next.addAll(prevlist);
            next.add(0);


            for (int j = 0; j < next.size() - 1; j++) {
                extendlist.add(next.get(j) + next.get(j + 1));
            }

            if (i == rowIndex){
                return extendlist;
            }

            base.add(extendlist);
        }

        return base.get(rowIndex);
    }

}
