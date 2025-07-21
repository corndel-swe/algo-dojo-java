package com.corndel.two_pointers.max_water_container;

public class MaxWaterContainer {

    public static int mostWaterBruteForce(int[] heights) {

        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int width = j - i;
                int height = Math.min(heights[i], heights[j]);
                int area = width * height;

                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }


    public static int mostWaterTwoPointers(int[] heights) {
        if (heights == null || heights.length < 2) {
            return 0;
        }

        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            int currentArea = width * minHeight;

            max = Math.max(max, currentArea);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

}
