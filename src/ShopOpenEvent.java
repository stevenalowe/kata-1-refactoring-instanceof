/**
 * ShopOpenEvent - an imaginary domain object recording data about a shop opening
 */
public class ShopOpenEvent extends ShopEvent {
    private String name;
    private int number;
    private String id;

    public String getName() { return name; }
    public void setName(String value) { name = value; }

    public int getNumber() { return number; }
    public void setNumber(int value) { number = value; }

    public String getId() { return id; }
    public void setId(String value) { id = value; }

    @Override
    public String convertToFlatFormat() {
        return String.format("%-7s-%10s:%05d", getId(), getName(), getNumber());
    }
}
