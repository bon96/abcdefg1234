package org.bon.ohjelmointitehtava.tehtava2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tommi
 * Date: 01/11/2020
 * Time: 20.10
 */

public class SmallestGap {

    public static int getSmallestGap(Integer[] orig) {
        Integer[] arr = Arrays.copyOf(orig, orig.length);
        Arrays.sort(arr);

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int gap = arr[i + 1] - arr[i] - 1;
            if (gap > 0 && gap < smallest) {
                smallest = gap;
            }
        }
        return smallest != Integer.MAX_VALUE ? smallest : -1;
    }


    private static Integer[] parseInput(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        if (args.length == 1) {
            args = args[0].split(",");
        }

        for (int i = 0; i < args.length; i++) {
            String line = args[i].replaceAll("[\\[+\\]{},]", "");
            if (!line.isEmpty()) {
                numbers.add(Integer.parseInt(line));
            }
        }
        return numbers.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        System.out.println(getSmallestGap(parseInput(args)));
    }
}
