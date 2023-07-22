package com.programs.basics.java8.twoTable;

import java.util.Objects;

public class Address {
    private int id;
    private String permanentAddress;
    private String tempAddress;

    public Address(int id, String permanentAddress, String tempAddress) {
        this.id = id;
        this.permanentAddress = permanentAddress;
        this.tempAddress = tempAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", tempAddress='" + tempAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id && permanentAddress.equals(address.permanentAddress) && tempAddress.equals(address.tempAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permanentAddress, tempAddress);
    }
}
