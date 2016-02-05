/**
 * GenerateFlatRecordForShopEvent - given a shop event of some kind, generate a flat-format record for it
 */
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(Object obj) {
        String flatFormatRecord = null;

        if (obj instanceof ShopOpenEvent) {
            flatFormatRecord = generateFlatFormatRecordForShopOpenEvent((ShopOpenEvent) obj);
        }
        else if (obj instanceof ShopCloseEvent) {
            flatFormatRecord = generateFlatFormatRecordForShopCloseEvent((ShopCloseEvent) obj);
        }

        return flatFormatRecord;
    }

    private String generateFlatFormatRecordForShopCloseEvent(ShopCloseEvent shopCloseEvent) {
        return getShopCloseFlatFormatGenerator().convert(shopCloseEvent);
    }

    private String generateFlatFormatRecordForShopOpenEvent(ShopOpenEvent shopOpenEvent) {
        return getShopOpenFlatFormatGenerator().convert(shopOpenEvent);
    }

    public ShopOpenEventFlatFormatGenerator getShopOpenFlatFormatGenerator() {
        return new ShopOpenEventFlatFormatGenerator();
    }

    public ShopCloseEventFlatFormatGenerator getShopCloseFlatFormatGenerator() {
        return new ShopCloseEventFlatFormatGenerator();
    }

}
