package _04_basic_sorting_algorithm.inbuild_sort;

import java.util.Arrays;

public class inbuild_sort {
    public static void main(String[] args) {
        int[] array = { 5, 20, 20, 4, 3, 100, 200, 1, 2, 1 };
        Arrays.sort(array);

        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k] + " ");
        }

    }
}
