package com.company.function;

import java.util.List;
import java.util.function.Supplier;

//used to return results and accepts no parameter
public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getEmployeeSupplier.get());
        System.out.println(getEmployeeListSupplier.get());

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

    static Supplier<Employee> getEmployeeSupplier = () -> new Employee("ashwin", "24");
    static Supplier<List<Employee>> getEmployeeListSupplier =
            () -> List.of(new Employee("ashwin", "24"), new Employee("chandraa", "17"));
}
