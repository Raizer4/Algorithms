package practice.leetcode.math;

// Convert the Temperature
// https://leetcode.com/problems/convert-the-temperature/description/

public class Leetcode_2469 {

    public static void main(String[] args) {
        double[] doubles = convertTemperature(36.50);

        for (double temp : doubles){
            System.out.println(temp);
        }

    }

    public static double[] convertTemperature(double celsius) {
        double[] array = new double[2];

        array[0] = celsius + 273.15;
        array[1] = celsius * 1.80 + 32.00;

        return array;
    }

}
