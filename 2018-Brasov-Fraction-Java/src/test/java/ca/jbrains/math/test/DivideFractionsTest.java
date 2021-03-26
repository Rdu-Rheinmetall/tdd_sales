package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideFractionsTest
{
    @Test(expected = RuntimeException.class)
    public void dividingByZeroThrows()
    {
        new Fraction(1).dividedBy(new Fraction(0));
    }

    @Test
    public void zeroDividedByAnythingEqualsZero()
    {
        assertEquals(new Fraction(0), new Fraction(0).dividedBy(new Fraction(1)));
        assertEquals(new Fraction(0), new Fraction(0).dividedBy(new Fraction(1, 2)));
    }

    @Test
    public void positiveFractions()
    {
        assertEquals(new Fraction(2, 3), new Fraction(1, 2).dividedBy(new Fraction(3, 4)));
    }

    @Test
    public void negativeDivider()
    {
        assertEquals(new Fraction(-2, 3), new Fraction(1, 2).dividedBy(new Fraction(-3, 4)));
    }

    @Test
    public void negativeFractions()
    {
        assertEquals(new Fraction(6, 5), new Fraction(-3, 5).dividedBy(new Fraction(-1, 2)));
    }

    @Test
    public void dividedByWholeNumber()
    {
        assertEquals(new Fraction(1, 4), new Fraction(1, 2).dividedBy(new Fraction(2)));
    }

    @Test
    public void wholeNumberDividedByFration()
    {
        assertEquals(new Fraction(4), new Fraction(1).dividedBy(new Fraction(1, 4)));
    }
}
