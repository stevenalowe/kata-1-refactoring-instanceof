/**
 * format ShopCloseEvent for flat-file output
 */
public class ShopCloseEventFlatFormatGenerator {
    public String convert(ShopCloseEvent record) {
        return String.format("%-7s-%10s:%05d (%s)",
                record.getId(), record.getName(), record.getNumber(), record.getCategory());
    }
}
