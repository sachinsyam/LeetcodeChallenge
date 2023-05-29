package May;

import java.util.*;

public class May27 {
    public static void main(String[] args) {
        int[] nums = frequencySort(new int[]{1, 1, 2, 2, 2, 3});
        int[] nums2 = frequencySortPriorityQueue(new int[]{1, 1, 2, 2, 2, 3});

        Arrays.stream(nums).forEach(a-> System.out.printf(a+" "));
        System.out.println();
        Arrays.stream(nums2).forEach(a-> System.out.printf(a+" "));

    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // count frequency of each number
        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
        // custom sort
        return Arrays.stream(nums).boxed()
                .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
        /*
        Arrays.stream(nums) - This converts the primitive array nums into a stream of boxed Integer objects.

.boxed() - This converts the stream of Integer objects to a stream of boxed integers. It is necessary because the subsequent operations require working with objects rather than primitives.

.sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a) - This sorts the elements of the stream using a comparator. The comparator compares two elements a and b based on the frequencies stored in the map. If the frequencies of a and b are different (map.get(a) != map.get(b)), it subtracts the frequencies to determine the comparison result. Otherwise, if the frequencies are the same, it subtracts b from a to sort them in descending order.

.mapToInt(n -> n) - This converts the stream of boxed integers back to a stream of primitive int values.

.toArray() - This collects the stream elements into an array of int values.

In summary, the code sorts the elements in the nums array based on their frequencies stored in the map. It uses the comparator to compare the elements first by frequency, and if the frequencies are the same, it compares them based on their values in descending order.

The final result is an array containing the sorted elements based on the provided sorting criteria.

Please note that for the code to work correctly, you should ensure that the map object is properly initialized and contains the necessary key-value pairs before executing the code.
         */
    }

    public static int[] frequencySortPriorityQueue(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Comparator.comparingInt((Integer num) -> map.get(num))
                        .thenComparingInt(num -> num)
        );

        for (int num : nums) {
            pq.offer(num);
        }

        int[] sortedNums = new int[nums.length];
        int index = 0;
        while (!pq.isEmpty()) {
            sortedNums[index++] = pq.poll();
        }

        return sortedNums;


    }



}
