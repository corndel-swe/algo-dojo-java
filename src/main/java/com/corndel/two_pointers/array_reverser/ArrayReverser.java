package com.corndel.two_pointers.array_reverser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverser {
    public static int[] reverseBruteForce(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            resultList.add(arr[i]);
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] reverseTwoPointers(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] a = Arrays.copyOf(arr, arr.length);

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        return a;
    }

}
