package com.programs.basics.java8.techgeeknext;

import java.util.ArrayList;
import java.util.List;

public class IteratingCollection {
    public static void main(String[] args) {
        // What are different ways of iterating collection list in Java 8?
        List<String> notes = new ArrayList<>();
        notes.add("note1");
        notes.add("note2");
        notes.add("note3");
        notes.add("note4");
        notes.add("note5");

        //Using lambda expression
        //Output : note1,note2,note3,note4,note5
        System.out.println("Using lambda expression");
        notes.forEach(note->System.out.println(note));

        //Output : note3
        System.out.println("\nForEach with Equals");
        notes.forEach(note->{
            if("note3".equals(note)){
                System.out.println(note);
            }
        });

        //Using Stream and filter
        //Output : note2
        System.out.println("\nForEach with Equals & filter");
        notes.stream()
                .filter(s->s.contains("note2"))
                .forEach(System.out::println);

        //Using method reference
        //Output : note1,note2,note3,note4,note5
        System.out.println("\nUsing method reference");
        notes.forEach(System.out::println);
    }
}
