package com.zsoltfabok.kata.currencyformat;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HungarianCurrencyFormatterTest {
    private HungarianCurrencyFormatter formatter;

    @Before
    public void setUp() {
        formatter = new HungarianCurrencyFormatter();
    }

    @Test
    public void shouldReturnTenHungarianFormat() {
        assertEquals("10", formatter.format("10"));
    }

    @Test
    public void shouldReturnOneHundredInHungarianFormat() {
        assertEquals("100", formatter.format("100"));
    }

    @Test
    public void shouldReturnTwoThousandInHungarianFormat() {
        final String actualResult = formatter.format("2000");
        assertEquals("2 000", actualResult);
    }

    @Test
    public void shouldReturnTwentyThousandInHungarianFormat() {
        assertEquals("20 000", formatter.format("20000"));
    }

    @Test
    public void shouldReturnHundredThousandInHungarianFormat() {
        assertEquals("100 000", formatter.format("100000"));
    }

    @Test
    public void shouldReturnOneMillionInHungarianFormat() {
        assertEquals("1 000 000", formatter.format("1000000"));
    }

    @Test
    public void shouldReturnTenPointOneInHungarianFormat() {
        assertEquals("10,1", formatter.format("10.1"));
    }

    @Test
    public void shouldReturnThousandPointOneInHungarianFormat() {
        assertEquals("1 000,1", formatter.format("1000.1"));
    }
}
