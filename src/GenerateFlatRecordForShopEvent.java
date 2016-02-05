/**
 * GenerateFlatRecordForShopEvent - given a shop event of some kind, generate a flat-format record for it
 */
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(ShopEvent shopEvent) {
        return shopEvent.convertToFlatFormat();
    }

}
