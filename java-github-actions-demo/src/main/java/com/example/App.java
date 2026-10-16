package com.example;

/** Small example application used by the GitHub Actions demo. */
public class App {
    /** Returns a greeting for the supplied name. */
    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet("GitHub Actions"));
    }
}
