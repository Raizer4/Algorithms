package practice.leetcode.two_pointers.medium;

// Rotating the Box
// https://leetcode.com/problems/rotating-the-box/description/

public class Leetcode_1861 {

    public static void main(String[] args) {
        char[][] temp = rotateTheBox(new char[][]{{'*','#','*','.','.','.','#','.','*','.'},});
    }

    public static char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        for (int i = 0; i < m; i++) {
            int write = n - 1;
            for (int j = n - 1; j >= 0; j--){
                if (boxGrid[i][j] == '*'){
                    write = j - 1;
                } else if (boxGrid[i][j] == '#') {
                     if (write != j){
                         boxGrid[i][write] = '#';
                         boxGrid[i][j] = '.';
                     }
                     write--;
                }
            }
        }

        char[][] arr = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return arr;
    }

}
