package com.corndel.two_pointers.array_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFilter {

    public static int[] getDistinctNumbersBruteForce(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                resultList.add(arr[i]);
            }
        }
        resultList.add(arr[arr.length - 1]);

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] getDistinctNumbersTwoPointers(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int[] mutableArr = Arrays.copyOf(arr, arr.length);

        int write = 1;
        for (int read = 1; read < mutableArr.length; read++) {

            if (mutableArr[read] != mutableArr[read - 1]) {
                mutableArr[write] = mutableArr[read];
                write++;
            }
        }

        return Arrays.copyOf(mutableArr, write);
    }
}
