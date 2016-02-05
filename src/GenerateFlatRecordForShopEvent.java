/**
 * GenerateFlatRecordForShopEvent - given a shop event of some kind, generate a flat-format record for it
 */
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(Object obj) {
        String flatFormatRecord = null;

        if (obj instanceof ShopEvent) {
            flatFormatRecord = convertShopOpenEventToFlatRecordFormat((ShopEvent) obj);
        }

        return flatFormatRecord;
    }

    private String convertShopOpenEventToFlatRecordFormat(ShopEvent shopEvent) {
        return shopEvent.convertToFlatFormat();
    }

}
