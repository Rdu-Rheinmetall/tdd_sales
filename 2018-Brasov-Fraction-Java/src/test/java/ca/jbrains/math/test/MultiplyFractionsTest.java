package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyFractionsTest
{
    @Test
    public void somethingTimesZeroEqualsZero()
    {
        assertEquals(new Fraction(0), new Fraction(1).times(new Fraction(0)));
    }

    @Test
    public void wholeAgainstFraction()
    {
        assertEquals(new Fraction(1, 2), new Fraction(1).times(new Fraction(1, 2)));
        assertEquals(new Fraction(-1, 2), new Fraction(1).times(new Fraction(-1, 2)));
    }

    @Test
    public void positiveFractions()
    {
        assertEquals(new Fraction(1, 4), new Fraction(1, 2).times(new Fraction(1, 2)));
    }

    @Test
    public void onePositiveAndOneNegative()
    {
        assertEquals(new Fraction(-3, 16), new Fraction(1, 4).times(new Fraction(-3, 4)));
    }

    @Test
    public void negativeFractions()
    {
        assertEquals(new Fraction(6, 25), new Fraction(-2, 5).times(new Fraction(-3, 5)));
    }
}
