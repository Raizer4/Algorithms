package practice.leetcode.leetcode_75.decision.day_2;

// Greatest Common Divisor of Strings
// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1071 {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));
        System.out.println(gcdOfStrings("AA","A"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }else {
            return gcd(b,a%b);
        }
    }

}
