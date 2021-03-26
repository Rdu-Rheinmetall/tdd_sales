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
}
