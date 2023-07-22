package com.programs.basics.java8.techgeeknext;

public class Optional_IfNotNull {
    public static void main(String[] args) {/*
        // How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
        List<String> notes = new ArrayList<>();
        notes.add("note1");
        notes.add("note2");
        notes.add("note3");
        notes.add("note4");
        notes.add("note5");

        Optional.ofNullable(notes)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
                .map(note -> Notes::getTagName) // method reference, consider only tag name
                .forEach(System.out::println); // it will print tag names
    */}
}
