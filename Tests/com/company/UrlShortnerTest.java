package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlShortnerTest {

    UrlShortner u1;

    @BeforeEach
    void setUp() {
        u1= new UrlShortner();
    }

    @Test
    void getRandomKey() {
        assertEquals(6,u1.getRandomKey().length());
    }

    @Test
    void code(String longURL){
        assertTrue(u1.encode(longURL).substring(20,26).contains("[a-zA-Z0-9]+"));
    }

    @Test
    void decode(String shortURL) {
       //ssertEquals(  u1.decode(shortURL));
    }
}