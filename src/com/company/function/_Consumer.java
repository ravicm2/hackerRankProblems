package com.company.function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Accepts input and wont return output . just actions with the input.
public class _Consumer {

    public static void main(String[] args) {

        Employee ashwin = new Employee("ashwin", "999999999");
        confirmEmployee.accept(ashwin);
        confirmEmployeeBooleanBiConsumer.accept(ashwin, false);
    }

    static BiConsumer<Employee, Boolean> confirmEmployeeBooleanBiConsumer = (employee, aBoolean) ->
            System.out.println("your name is " + employee.name + " your phone is " + employee.number + " "
                    + " phone is " + (aBoolean ? "valid" : "not valid"));
    static Consumer<Employee> confirmEmployee =
            employee -> System.out.println("your name is " + employee.name + " your phone is " + employee.number);

    static class Employee {
        private String name;
        private String number;

        public Employee(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }
}
