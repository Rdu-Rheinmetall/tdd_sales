package ca.rheinmetall.pos;

import org.junit.Test;

public class BarcodeProcessorTest
{
    @Test
    public void onEmptyBarcode()
    {
        final BarcodeProcessor barcodeProcessor = new BarcodeProcessor();
        barcodeProcessor.onBarcode("");
    }
}
