package com.neopragma.train;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class FizzbuzzTest
{
    private Fizzbuzz fizzbuzz;

    @Before
    public void beforeEachTestCase() {
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void itReturnsFizzForTheNumber3() {
        assertEquals("Fizz", fizzbuzz.processNumber(3));
    }

}
