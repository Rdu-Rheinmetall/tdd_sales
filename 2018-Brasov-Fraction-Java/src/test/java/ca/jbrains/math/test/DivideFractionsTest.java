package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

public class DivideFractionsTest
{
    @Test(expected = RuntimeException.class)
    public void dividingByZeroThrows()
    {
        new Fraction(1).dividedBy(new Fraction(0));
    }
}
