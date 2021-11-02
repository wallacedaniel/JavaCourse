package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object oriented, platform independent language");
        }

        languages.put("Python", "another oop language");
        languages.put("Algol", "algorithmic  language");
        System.out.println(languages.put("JavaScript", "web language"));
        System.out.println(languages.put("Lisp", "therein lies madness"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already there");
        } else {
            languages.put("Java", "all the Java");
        }

        System.out.println("===============");

        System.out.println(languages.replace("Lisp", "replace the value"));

        if(languages.replace("Lisp", "won't replace", "replace me")){
            System.out.println("replaced");
        } else {
            System.out.println("not replaced");
        }

        System.out.println(languages.replace("SQL", "won't replace"));

        if(languages.remove("Algol", "incorrect value won't remove")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }

        System.out.println("Lisp");

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
