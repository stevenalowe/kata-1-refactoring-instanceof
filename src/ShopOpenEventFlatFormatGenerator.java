/**
 * format ShopOpenEvent for flat-file output
 */
public class ShopOpenEventFlatFormatGenerator {
    public String convert(ShopOpenEvent record) {
        return String.format("%-7s-%10s:%05d",
                record.getId(), record.getName(), record.getNumber());
    }
}
