package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero()
    {
        final Fraction sum = new Fraction(0).plus(new Fraction(0));
        Assert.assertEquals(new Fraction(0), sum);
    }

    @Test
    public void notZeroPlusZero()
    {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        Assert.assertEquals(new Fraction(3), sum);
    }

    @Test
    public void zeroPlusNotZero()
    {
        final Fraction sum = new Fraction(0).plus(new Fraction(6));
        Assert.assertEquals(new Fraction(6), sum);
    }

    @Test
    public void notZeroPlusNotZero()
    {
        final Fraction sum = new Fraction(3).plus(new Fraction(6));
        Assert.assertEquals(new Fraction(9), sum);
    }

    @Test
    public void nonIntegersWithTheSameDenominator()
    {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        Assert.assertEquals(new Fraction(3, 5), sum);
    }

    @Test
    public void differentDenominatorsWithoutCommonFactors()
    {
        final Fraction sum = new Fraction(7, 4).plus(new Fraction(3, 5));
        Assert.assertEquals(new Fraction(47, 20), sum);
    }

    @Test
    public void sameDenominatorWhichMeansCommonFactors()
    {
        final Fraction sum = new Fraction(1, 2).plus(new Fraction(1, 2));
        Assert.assertEquals(new Fraction(1), sum);
    }

    @Test
    public void differentDenominatorsWithCommonFactors()
    {
        final Fraction sum = new Fraction(1, 2).plus(new Fraction(1, 4));
        Assert.assertEquals(new Fraction(3, 4), sum);
    }
}
