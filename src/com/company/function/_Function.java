package com.company.function;

import java.util.function.BiFunction;
import java.util.function.Function;

//accepts input and return a output
 class Function2 {

    public static void main(String[] args) {

        System.out.println(incrementNumberByOneFunction.apply(51));
        System.out.println(incrementAndMultiply.apply(100,99999999));
    }

    // java 8 function
    static Function<Integer, Integer> incrementNumberByOneFunction = number -> number + 1;

    //BiFunction
    static BiFunction<Integer, Integer, Integer> incrementAndMultiply = (number, multiplyBy) -> number + 1 * multiplyBy;

    //Normal Function
   public static int incrementNumberByOne(int number) {
        return number + 1;
    }
}
