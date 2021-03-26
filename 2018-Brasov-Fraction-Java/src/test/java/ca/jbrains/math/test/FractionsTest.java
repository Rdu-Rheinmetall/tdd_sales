package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

public class FractionsTest
{
    @Test(expected = RuntimeException.class)
    public void denominatorCannotBeZero()
    {
        new Fraction(1, 0);
    }
}
