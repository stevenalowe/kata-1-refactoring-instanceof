import org.junit.Assert;
import org.junit.Test;

/**
 * unit tests for GenerateFlatRecordForShopEvent class
 */
public class TestGenerateFlatRecordFromShopEvent {

    /**
     * Given: a blank shop-open event
     *  When: a flat-format record is generated
     *  Then: it should match the blank-record format, with padding
     */
    @Test
    public void GivenBlankShopOpenEventGenerateBlankFlatFormatRecord() {
        final String expectedBlankFlatFormatRecord = "       -          :00000";

        GenerateFlatRecordForShopEvent flatRecordGenerator = new GenerateFlatRecordForShopEvent();
        Assert.assertNotNull("GenerateFlatRecordForShopEvent created", flatRecordGenerator);

        ShopOpenEvent shopOpenEvent = new ShopOpenEvent();
        Assert.assertNotNull("ShopOpenEvent created", shopOpenEvent);

        shopOpenEvent.setId("");
        shopOpenEvent.setName("");
        shopOpenEvent.setNumber(0);

        String flatFormatRecord = flatRecordGenerator.generateFlatFormatRecordForShopEvent(shopOpenEvent);
        Assert.assertNotNull("ShopOpenEvent flat-format record created", flatFormatRecord);

        Assert.assertEquals("ShopOpenEvent flat-format record is blank", expectedBlankFlatFormatRecord, flatFormatRecord);
    }

    /**
     * Given: a blank shop-close event
     *  When: a flat-format record is generated
     *  Then: it should match the blank-record format, with padding
     */
    @Test
    public void GivenBlankShopCloseRecordGenerateBlankFlatFormatRecord() {
        final String expectedBlankFlatFormatRecord = "       -          :00000 ()";

        GenerateFlatRecordForShopEvent flatRecordGenerator = new GenerateFlatRecordForShopEvent();
        Assert.assertNotNull("GenerateFlatRecordForShopEvent created", flatRecordGenerator);

        ShopCloseEvent shopCloseEvent = new ShopCloseEvent();
        Assert.assertNotNull("ShopCloseEvent created", shopCloseEvent);

        shopCloseEvent.setId("");
        shopCloseEvent.setName("");
        shopCloseEvent.setNumber(0);
        shopCloseEvent.setCategory("");

        String flatFormatRecord = flatRecordGenerator.generateFlatFormatRecordForShopEvent(shopCloseEvent);
        Assert.assertNotNull("ShopCloseEvent flat-format record created", flatFormatRecord);

        Assert.assertEquals("ShopCloseEvent flat-format record is blank", expectedBlankFlatFormatRecord, flatFormatRecord);
    }

    /**
     * Given: a non-blank shop-open event
     *  When: a flat-format record is generated
     *  Then: it should match the flat-record format, with padding
     */
    @Test
    public void GivenNonBlankShopOpenEventGenerateExpectedFlatFormatRecord() {
        final String expectedOpenEventFlatFormatRecord = "12345  -   Record1:00001";

        GenerateFlatRecordForShopEvent flatRecordGenerator = new GenerateFlatRecordForShopEvent();
        Assert.assertNotNull("Kata created", flatRecordGenerator);

        ShopOpenEvent shopOpenEvent = new ShopOpenEvent();
        Assert.assertNotNull("Record1 created", shopOpenEvent);

        shopOpenEvent.setId("12345");
        shopOpenEvent.setName("Record1");
        shopOpenEvent.setNumber(1);

        String flatFormatRecord = flatRecordGenerator.generateFlatFormatRecordForShopEvent(shopOpenEvent);
        Assert.assertNotNull("flatRecord1 created", flatFormatRecord);

        Assert.assertEquals("flatRecord1 is correct", expectedOpenEventFlatFormatRecord, flatFormatRecord);
    }

    /**
     * Given: a non-blank shop-close event
     *  When: a flat-format record is generated
     *  Then: it should match the flat-record format, with padding
     */
    @Test
    public void GivenNonBlankShopCloseEventGenerateExpectedFlatFormatRecord() {
        final String expectedCloseEventFlatFormatRecord = "54321  -   Record2:00002 (TEST)";

        GenerateFlatRecordForShopEvent flatRecordGenerator = new GenerateFlatRecordForShopEvent();
        Assert.assertNotNull("Kata created", flatRecordGenerator);

        ShopCloseEvent shopCloseEvent = new ShopCloseEvent();
        Assert.assertNotNull("Record2 created", shopCloseEvent);

        shopCloseEvent.setId("54321");
        shopCloseEvent.setName("Record2");
        shopCloseEvent.setNumber(2);
        shopCloseEvent.setCategory("TEST");

        String flatFormatRecord = flatRecordGenerator.generateFlatFormatRecordForShopEvent(shopCloseEvent);
        Assert.assertNotNull("flatRecord2 created", flatFormatRecord);

        Assert.assertEquals("flatRecord2 is correct", expectedCloseEventFlatFormatRecord, flatFormatRecord);
    }
}
