package com.company.streams;

import java.util.List;
import java.util.stream.Collectors;

// chain of executions performed on collections , arrays
public class _Streams {
    public static void main(String[] args) {

        List<Employee> employeeList = List.of(

                new Employee("ashwin", "24"),
                new Employee("chandraa", "19"),
                new Employee("sahithi", "24"),
                new Employee("gayathri", "24"),
                new Employee("lavanya", "24"),
                new Employee("meena", "24"),
                new Employee("keerthana", "24"),
                new Employee("meenakshi", "24")
        );

        employeeList.stream()
                .map(employee -> employee.name)
                .filter(name -> name.equals("chandraa"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println(
                employeeList.stream()
                        .anyMatch(employee -> "24".equals(employee.number))
        );

        System.out.println(
                employeeList.stream()
                        .allMatch(employee -> "24".equals(employee.number))
        );

        System.out.println(
                employeeList.stream()
                        .noneMatch(employee -> "100".equals(employee.number))
        );

    }

    static class Employee {
        private String name;
        private String number;

        public Employee(String name, String number) {
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }


}
