package com.company.Optional;

import java.util.Optional;

//uses functional interfaces and helps to prevent NPE
public class _Optional {

    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null).orElse("default"));

        System.out.println(
                Optional.ofNullable("hello").orElseGet(()->"no value present")
        );

        Optional.ofNullable(null).orElseThrow(()-> new IllegalArgumentException());




    }
}
