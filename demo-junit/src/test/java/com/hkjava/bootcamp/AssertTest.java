package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions;

import java.beans.Transient;
import java.time.Duration;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)

public class AssertTest {

    private int a;

    @DisplayName("AssertNo")
    @Test
    void testAdd() {
        Assertions.assertEquals(5, App.add(2, 3));
        a++;
        assertEquals(1, x);

    }

    @Test testNotEqual(){
        Assertions.assertNotEquals(4, App.add(1, 2));
        x++;
        assertEquals(1, x);
    }

    @Test 
    void testAssertNotNull(){
        Student student = new Student();
        assertNotNull
    }

    @Test
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10, 0);
        });

        assertDoesNotThrows(() - >{
            App.divide(10, 5);
        });
    }

    @Test
    void testAssertTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
        });
    }

    @Testvoid testCombine(){
       assertAll(
        ()-> assertTrue(10 > 3),
        ()-> assertEquals(10, App.add(4, 6)),
        ()->asserNull(null)
       );
    }

    @Test
    void testSame() {
        String s1 = new String("JUnit");
        String s2 = new String("JUnit");
        assertNotSame(s1, s2);

        String s3 = "JUnit";
        String s4 = "Junit";
        assertSame(s3, s4);
        assertEquals(s3, s4);
    }

}
