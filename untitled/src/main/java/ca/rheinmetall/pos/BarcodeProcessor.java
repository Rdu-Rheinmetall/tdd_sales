package ca.rheinmetall.pos;

import ca.rheinmetall.pos.output.DataOutputter;

public class BarcodeProcessor
{
    private final DataOutputter _dataOutputter;

    public BarcodeProcessor(final DataOutputter dataOutputter)
    {
        _dataOutputter = dataOutputter;
    }

    public void onBarcode(final String barcode)
    {
        _dataOutputter.output("");
    }
}
