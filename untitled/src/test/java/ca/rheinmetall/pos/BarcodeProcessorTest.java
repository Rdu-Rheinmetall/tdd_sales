package ca.rheinmetall.pos;

import ca.rheinmetall.pos.output.DataOutputter;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BarcodeProcessorTest
{
    private final DataOutputter _mockDataOutputter = mock(DataOutputter.class);
    private BarcodeProcessor _barcodeProcessor;

    @Before
    public void setUp() throws Exception
    {
        _barcodeProcessor = new BarcodeProcessor(_mockDataOutputter);
    }

    @Test
    public void onEmptyBarcode()
    {
        _barcodeProcessor.onBarcode("");
        verify(_mockDataOutputter).output("");
    }

    @Test
    public void onValidKnownItemBarcode()
    {
        _barcodeProcessor.onBarcode("012345678901");
        verify(_mockDataOutputter).output("$9.99");
    }
}
