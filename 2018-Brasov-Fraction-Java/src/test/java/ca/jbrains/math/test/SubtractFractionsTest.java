package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractFractionsTest
{
    @Test
    public void simplePositiveFractionsSubtraction()
    {
        assertEquals(new Fraction(1, 4), new Fraction(1, 2).minus(new Fraction(1, 4)));
    }

    @Test
    public void subtractNegativeFromPositive()
    {
        assertEquals(new Fraction(3, 4), new Fraction(1, 2).minus(new Fraction(-1, 4)));
    }

    @Test
    public void subtractingToWholeNumberResult()
    {
        assertEquals(new Fraction(1), new Fraction(3, 2).minus(new Fraction(1, 2)));
    }

    @Test
    public void subtractingToANegativeFunctionResult()
    {
        assertEquals(new Fraction(-1, 4), new Fraction(1, 2).minus(new Fraction(3, 4)));
    }

    @Test
    public void subtractingWholeNumber()
    {
        assertEquals(new Fraction(3, 4), new Fraction(7, 4).minus(new Fraction(1)));
    }

    @Test
    public void subtractingNegativeFromNegativeToPositiveResult()
    {
        assertEquals(new Fraction(1, 2), new Fraction(-2, 3).minus(new Fraction(-7, 6)));
    }

    @Test
    public void subtractingPositiveFromNegativeToNegativeResult()
    {
        assertEquals(new Fraction(-9, 16), new Fraction(-5, 16).minus(new Fraction(1, 4)));
    }
}
