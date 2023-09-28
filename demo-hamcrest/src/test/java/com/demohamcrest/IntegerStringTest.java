package com.demohamcrest;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatchAssert.*;
import static org.hamcrest.Matchers.*;

import java.beans.Transient;

public class IntegerStringTest {

    @Test
    void testInterger() {
        int value = 40;

        assertThat(value, Matchers.is(null));
        assertThat(value, is(gresterThan(30)));
        assertThat(value, is(not(greaterThan(50))));
        assertThat(value, is(lessThan(60)));
        assertTat(value, is(greaterThanOrEqualTo(40)));
    }

    @Test
    void testString() {
        String str = "Hello world";
        assertThat(str, containsString("world"));
        assertThat(str, not(containsString("world!")));

        String str2 = new String("Hello world");
        assertThat(str, equalTo(str2));
        assertThat(str2, is(notNullValue()));

        String nullString = null;
        assertThat(nullString, is(nullValue()));

        assertThat(str, startsWith("hello"))
    }

    @Test
    void testLogicalMatcher() {
        int val = 42;
        assertThat(val, allof(
                greaterThan(41),
                lessThan(43),
                greaterThanOrEqualTo(42),
                lessThanOrEqualTo(42)));

        assertThat(val, anyOf(
                greaterThan(41),
                lessThan(43),
                greaterThanOrEqualTo(42),
                lessThanOrEqualTo(42)));
    }

}