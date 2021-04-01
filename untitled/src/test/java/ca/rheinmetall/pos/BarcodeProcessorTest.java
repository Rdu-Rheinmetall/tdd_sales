package ca.rheinmetall.pos;

import ca.rheinmetall.pos.model.BarcodesContainer;
import ca.rheinmetall.pos.model.Item;
import ca.rheinmetall.pos.output.DataOutputter;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BarcodeProcessorTest
{
    private final DataOutputter _mockDataOutputter = mock(DataOutputter.class);
    private final BarcodesContainer _mockBarcodesContainer = mock(BarcodesContainer.class);

    private BarcodeProcessor _barcodeProcessor;

    @Before
    public void setUp()
    {
        _barcodeProcessor = new BarcodeProcessor(_mockDataOutputter, _mockBarcodesContainer);
    }

    @Test
    public void onEmptyBarcode()
    {
        _barcodeProcessor.onBarcode("");
        verify(_mockDataOutputter).output("");
    }

    @Test
    public void onKnownItemBarcode()
    {
        final String barcode = "012345678901";
        final Item matchingItem = new Item();
        when(_mockBarcodesContainer.findItemByBarcode(barcode)).thenReturn(matchingItem);
        _barcodeProcessor.onBarcode(barcode);
        verify(_mockDataOutputter).output("$9.99");
    }

    @Test
    public void onUnknownBarcode()
    {
        _barcodeProcessor.onBarcode("abc123");
        verify(_mockDataOutputter).output("");
        reset(_mockDataOutputter);

        _barcodeProcessor.onBarcode("0123");
        verify(_mockDataOutputter).output("");
        reset(_mockDataOutputter);

        _barcodeProcessor.onBarcode("abcdefghijkl");
        verify(_mockDataOutputter).output("");
        reset(_mockDataOutputter);

        _barcodeProcessor.onBarcode("01234567890123");
        verify(_mockDataOutputter).output("");
    }
}
