package practice.challenge.leetcode_75;




import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode_2542 {

    public static void main(String[] args) {

    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] pairs = new int[nums1.length][2];

        for (int i = 0; i < nums1.length; i++) {
            pairs[i][0] = nums2[i];
            pairs[i][1] = nums1[i];
        }

        // Сортируем пары по значению nums2[i] в убывающем порядке
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        // Куча для хранения наибольших элементов из nums1
        PriorityQueue<Integer> heap = new PriorityQueue<>(k);
        long sum = 0;
        long maxScore = 0;

        // Проходим по отсортированным парам
        for (int i = 0; i < nums1.length; i++) {
            int num2 = pairs[i][0];
            int num1 = pairs[i][1];

            // Добавляем текущий элемент из nums1 в кучу и суммируем
            heap.add(num1);
            sum += num1;

            // Если куча содержит больше k элементов, удаляем наименьший
            if (heap.size() > k) {
                sum -= heap.poll();
            }

            // Если мы собрали k элементов, вычисляем текущий балл
            if (heap.size() == k) {
                maxScore = Math.max(maxScore, sum * num2);
            }
        }

        return maxScore;

    }

}
