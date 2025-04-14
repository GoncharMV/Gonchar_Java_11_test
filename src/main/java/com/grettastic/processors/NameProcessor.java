package com.grettastic.processors;

public class NameProcessor {

    public static void checkName(String name) {
        if (name.equals("John")) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("There is no such name");
        }
    }
}
