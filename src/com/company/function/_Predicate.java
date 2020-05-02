package com.company.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isValidPhone.test("0913278403"));

        //chain method example
        System.out.println(isValidPhone.and(isValidPhoneAndHasElevenDigits).test("33333333333"));
        System.out.println(isValidPhone.or(isValidPhoneAndHasElevenDigits).test("00000000000"));
    }

    static Predicate<String> isValidPhone = phone -> phone.contains("3");
    static Predicate<String> isValidPhoneAndHasElevenDigits =
            (phone) -> phone.length() == 11;
}
