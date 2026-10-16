package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    private final App app = new App();

    @Test
    void greetsAName() {
        assertEquals("Hello, Sowmya!", app.greet("Sowmya"));
    }

    @Test
    void usesDefaultGreetingForBlankName() {
        assertEquals("Hello, World!", app.greet(" "));
    }
}
