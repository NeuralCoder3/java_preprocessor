package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import implementation.Fib;

public class FibTest {

    @Test
    public void testFib() {
        assertEquals(0, Fib.fib(0));
        assertEquals(1, Fib.fib(1));
        assertEquals(1, Fib.fib(2));
        assertEquals(2, Fib.fib(3));
        assertEquals(3, Fib.fib(4));
        assertEquals(5, Fib.fib(5));
        assertEquals(8, Fib.fib(6));
        assertEquals(13, Fib.fib(7));
        assertEquals(21, Fib.fib(8));
        assertEquals(34, Fib.fib(9));
        assertEquals(55, Fib.fib(10));
    }

    @Test
    public void testFibNegative() {
        assertThrows(IllegalArgumentException.class, () -> Fib.fib(-1));
    }

}