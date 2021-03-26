package ca.jbrains.math;

public class Fraction
{
    private final int _numerator;
    private final int _denominator;

    public Fraction(final int integerValue)
    {
        this(integerValue, 1);
    }

    public Fraction(final int numerator, final int denominator)
    {
        if (0 == denominator)
            throw new DenominatorCannotBeZeroException();
        _numerator = numerator;
        _denominator = denominator;
    }

    public Fraction plus(final Fraction that)
    {
        return new Fraction(_numerator * that._denominator + _denominator * that._numerator,
                            _denominator * that._denominator);
    }

    public Fraction minus(final Fraction that)
    {
        return new Fraction(_numerator * that._denominator - _denominator * that._numerator,
                            _denominator * that._denominator);
    }

    @Override
    public boolean equals(final Object other)
    {
        if (other instanceof Fraction)
        {
            final Fraction that = (Fraction) other;

            return _numerator * that._denominator == that._numerator * _denominator;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return -762;
    }

    @Override
    public String toString()
    {
        return _numerator + "/" + _denominator;
    }

    private static class DenominatorCannotBeZeroException extends RuntimeException
    {
    }
}
