import org.junit.Test;

import static org.junit.Assert.*;

public class EqualsTest
{
    @Test
    public void equalsToSelfReturnsTrue()
    {
        final Object o1 = new Object();
        final Object o2 = o1;
        assertTrue(o1.equals(o2));
    }

    @Test
    public void isIsSymetric()
    {
        final Object o1 = new Object();
        final Object o2 = o1;
        assertTrue(o1.equals(o2));
        assertTrue(o2.equals(o1));

        final Object o3 = new Object();
        assertFalse(o1.equals(o3));
        assertFalse(o3.equals(o1));
    }

    @Test
    public void itIsTransitive()
    {
        final Object o1 = new Object();
        final Object o2 = o1;
        final Object o3 = o2;
        assertTrue(o1.equals(o2));
        assertTrue(o2.equals(o3));
        assertTrue(o1.equals(o3));

        final Object o4 = new Object();
        assertTrue(o1.equals(o2));
        assertFalse(o2.equals(o4));
        assertFalse(o1.equals(o4));
    }

    @Test
    public void itIsConsistent()
    {
        final Object o1 = new Object();
        final Object o2 = o1;
        assertTrue(o1.equals(o2));
        assertTrue(o1.equals(o2));
        assertTrue(o1.equals(o2));

        final Object o3 = new Object();
        assertFalse(o1.equals(o3));
        assertFalse(o1.equals(o3));
        assertFalse(o1.equals(o3));
    }

    @Test
    public void equalsToNullReturnsFalse()
    {
        final Object o1 = new Object();
        assertFalse(o1.equals(null));
    }
}
