package com.corndel.two_pointers.zero_shifter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroShifter {

    public static int[] shiftZerosBruteForce(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        List<Integer> nonZeros = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int n : arr) {
            if (n == 0) {
                zeros.add(0);
            } else {
                nonZeros.add(n);
            }
        }

        int[] result = new int[nonZeros.size() + zeros.size()];
        int k = 0;

        for (int n : nonZeros) {
            result[k++] = n;
        }
        for (int n : zeros) {
            result[k++] = n;
        }

        return result;
    }


    public static int[] shiftZerosTwoPointers(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] a = Arrays.copyOf(arr, arr.length);

        int write = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[write++] = a[i];
            }
        }

        while (write < a.length) {
            a[write++] = 0;
        }

        return a;
    }
}
