/**
 * GenerateFlatRecordForShopEvent - given a shop event of some kind, generate a flat-format record for it
 */
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(Object obj) {
        String flatFormatRecord = null;

        if (obj instanceof ShopOpenEvent) {
            flatFormatRecord = convertShopOpenEventToFlatRecordFormat((ShopOpenEvent) obj);
        }
        else if (obj instanceof ShopCloseEvent) {
            flatFormatRecord = convertShopCloseEventToFlatRecordFormat((ShopCloseEvent) obj);
        }

        return flatFormatRecord;
    }

    private String convertShopCloseEventToFlatRecordFormat(ShopCloseEvent shopCloseEvent) {
        return shopCloseEvent.convertToFlatFormat();
    }

    private String convertShopOpenEventToFlatRecordFormat(ShopOpenEvent shopOpenEvent) {
        return shopOpenEvent.convertToFlatFormat();
    }

}
