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
        if (isKnownItemBarcode(barcode))
            _dataOutputter.output("$9.99");
        else
            _dataOutputter.output("");
    }

    private boolean isKnownItemBarcode(final String barcode)
    {
        return barcode != null && barcode.trim().length() > 0;
    }
}
