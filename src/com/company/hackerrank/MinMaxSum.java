package com.company.hackerrank;

import java.util.Arrays;

public class MinMaxSum {

    public static void main(String[] args) {

        miniMaxSum(new int[]{1,2,3,4,5});
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
        long resultMax=total-max;
        long resultMin=total-min;
        System.out.println(resultMax+" "+resultMin);

    }
}
