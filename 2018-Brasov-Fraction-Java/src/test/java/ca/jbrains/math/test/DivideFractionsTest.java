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
}
