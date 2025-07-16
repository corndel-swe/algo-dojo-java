package com.corndel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterTest {

    private Tester tester = new Tester();

    @Test
    public void testTester() {
       assertEquals(45, tester.test());
    }
}