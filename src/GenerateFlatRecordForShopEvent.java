/**
 * GenerateFlatRecordForShopEvent - given a shop event of some kind, generate a flat-format record for it
 */
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(Object obj) {
        String flatFormatRecord = null;

        if (obj instanceof ShopEvent) {
            ShopEvent shopEvent = (ShopEvent)obj;
            flatFormatRecord = shopEvent.convertToFlatFormat();
        }

        return flatFormatRecord;
    }

}
