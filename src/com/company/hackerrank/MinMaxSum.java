package com.company.hackerrank;

import java.util.Arrays;

public class MinMaxSum {

    public static void main(String[] args) {

    }

    static void miniMaxSum(int[] arr) {

        long max = arr[0];
        long min = arr[0];
        long total = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            total += arr[i];

        }
        System.out.println(total - max);
        System.out.println(total - min);

    }
}
