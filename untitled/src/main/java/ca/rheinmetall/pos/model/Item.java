package ca.rheinmetall.pos.model;

public class Item
{
    private final double _price;

    public Item(final double price)
    {
        _price = price;
    }

    public double getPrice()
    {
        return _price;
    }
}
