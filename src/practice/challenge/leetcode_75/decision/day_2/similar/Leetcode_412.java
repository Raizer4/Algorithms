package practice.challenge.leetcode_75.decision.day_2.similar;

// Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_412 {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if (i % 3 == 0){
                list.add("Fizz");
            }else if (i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }

}
