package ca.rheinmetall.pos;

import ca.rheinmetall.pos.model.BarcodesContainer;
import ca.rheinmetall.pos.model.Item;
import ca.rheinmetall.pos.output.DataOutputter;

public class BarcodeProcessor
{
    private final DataOutputter _dataOutputter;
    private final BarcodesContainer _barcodesContainer;

    public BarcodeProcessor(final DataOutputter dataOutputter,
                            final BarcodesContainer barcodesContainer)
    {
        _dataOutputter = dataOutputter;
        _barcodesContainer = barcodesContainer;
    }

    public void onBarcode(final String barcode)
    {
        final Item item = _barcodesContainer.findItemByBarcode(barcode);
        if (item != null)
            _dataOutputter.output(formatItemOutput(item));
        else
            _dataOutputter.output("");
    }

    private String formatItemOutput(final Item item)
    {
        return String.format("$%.2f", item.getPrice());
    }
}
