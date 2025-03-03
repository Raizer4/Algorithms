package practice.leetcode.array.easy;

// Maximum Population Year
// https://leetcode.com/problems/maximum-population-year/description/

public class Leetcode_1854 {

    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{1993,1999},{2000,2010}}));
        System.out.println(maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
        System.out.println(maximumPopulation(new int[][]{{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}}));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] populationChange = new int[2051];

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            populationChange[birth] += 1;
            populationChange[death] -= 1;
        }

        int maxYear = 1950;
        int maxPopulation = 0;
        int currentPopulation = 0;

        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += populationChange[year];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = year;
            }
        }

        return maxYear;
    }

}
