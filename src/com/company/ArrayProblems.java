package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayProblems {

    //wrong solution in printing
    public static void main(String[] args) {

        int[][] array =new int[][]{
                new int[]{1,2},
                new int[]{3,4}
        };

        System.out.println("before: ");
        Stream.of(array).forEach(System.out::println);

        List<String> asList= Arrays.asList(array.toString());
        Collections.reverse(asList);
        System.out.println("after: ");
        asList.forEach(System.out::println);
    }



}
