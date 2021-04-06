package ca.rheinmetall.pos.model;

public interface BarcodesContainer
{
    Item findItemByBarcode(String barcode);
}
