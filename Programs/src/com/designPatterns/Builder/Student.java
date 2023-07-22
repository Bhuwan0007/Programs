package com.designPatterns.Builder;
import java.util.Objects;

final class Student {

    private final int id;
    private final String name;
    private final String address;

    public Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static class Builder{
        private int id;
        private String name;
        private String address;

        public static Builder newInstance(){
            return new Builder();
        }

        private Builder(){  }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
