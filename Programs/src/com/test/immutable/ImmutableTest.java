package com.test.immutable;

import java.util.Arrays;
import java.util.List;

final class Department{
     final int id;
     final String departmentName;
     final String departmentType;




    public Department(int id, String departmentName, String departmentType, List<String> empName) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentType = departmentType;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentType() {
        return departmentType;
    }
}

public class ImmutableTest {
    public static void main(String[] args) {
        List<String> empName = Arrays.asList("Bhuwan","d","f","g","h");
        empName.stream().map(s->s.concat("zee")).forEach(System.out::println);
    }
}
