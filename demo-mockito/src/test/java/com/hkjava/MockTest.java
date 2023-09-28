package com.hkjava;

import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith()
public class MockTest {
    /**
     * Rigorous Test :-)
     */
    @InjectMocks
    Chectkout checkout;

    @Mock
    Calculator calculator;

    @Mock
    Calculator calculator2;

    @Test
    void testSubstract() {
        Calculator calculator = newCalculator(3);
        assertEquals(-7, selfNew.substract(10, 6));
        assertEquals(6, selfNew.multiply(2, 3));
    }

    @Test
    void testAdd1(){
        when(calculator.substract(3, 4)).thenReturn(100);

        //Chectout checkout = new Checkout(calculator);

        int result = checkout.add(3, 4);
        assertEquals(104, result);

        verify(calculator, times(1)).substract(3, 4);
        }

    @Test
    void testAdd2(){
        when(calculator2.substract(1, 4)).thenReturn(100);

       // Chectout checkout = new Checkout(calculator);

        int result = checkout.add(1, 4);
        assertEquals(104, result);
        }

    @Test
        void testMultiply(){
            when(calculator.substract(7, 9)).thenReturn(10000);
            int result = checkout.multiply(7, 9);
            assertEquals(10009, result);
        }

    @Test
        void testMultiply2(){
            when(calculator.substract(7, 9)).thenReturn(10000);
            int result = checkout.multiply(7, 9);
            assertEquals(8, result);
}
}
