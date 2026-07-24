package com.rev.demo;

import org.junit.jupiter.api.*;

public class TestDemo {

    @Test
    public void testDemoOne() {
        System.out.println("First Test Case...");
    }

    @Test
    public void testDemoTwo() {
        System.out.println("Second Test Case...");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown");
    }

    @BeforeAll
    public static void setUpp() {
        System.out.println("setUpp");
    }

    @AfterAll
    public static void tearDownn() {
        System.out.println("tearDownn");
    }
}
