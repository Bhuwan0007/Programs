package com.programs.basics.java8.twoTable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetails {
   // .andThen(Address::getTempAddress));;

    public static void main(String[] args) {
        Address addr1 = new Address(1,"perm1","temp1");
        Address addr2 = new Address(2,"perm2","temp2");
        Address addr3 = new Address(3,"perm3","temp3");

        /*List<Address> address = new ArrayList<>();
        address.add(new Address(1,"perm1","temp1"));
        address.add(new Address(2,"perm2","temp2"));
        address.add(new Address(3,"perm3","temp3"));*/

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bhuwan",101, addr1));
        employees.add(new Employee("Vinod",101, addr2));
        employees.add(new Employee("Manoj",101, addr3));

        //System.out.println(employees.stream().filter());

        employees.stream().map(Employee::toString).collect(Collectors.toList()).forEach(System.out::println);
        //Stream<Employee> rStream = employees.stream().flatMap(Collectors::joining().andThen(Address::getTempAddress));

        /*Stream<String> st = Stream.iterate("", (str) -> str + "x");
        System.out.println(st.limit(3).map(str -> str + "y"));
*/

    }
}
