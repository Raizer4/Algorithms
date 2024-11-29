package practice.challenge.leetcode_75.decision.day_2.similar;

// Determine Color of a Chessboard Square
// https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/

public class Leetcode_1812 {

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));
    }

    public static boolean squareIsWhite(String coordinates) {
        int i = coordinates.charAt(0);
        int g = Integer.parseInt(String.valueOf(coordinates.charAt(1)));

        if (i % 2 == 0 && g % 2 == 0 || i % 2 == 1 && g % 2 == 1){
            return false;
        }else {
            return true;
        }

    }

}
