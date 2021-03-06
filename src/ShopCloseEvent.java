/**
 * ShopCloseEvent - an imaginary domain object recording data about a shop closing
 */
public class ShopCloseEvent extends ShopEvent {
    private String name;
    private int number;
    private String id;
    private String category;

    public String getName() { return name; }
    public void setName(String value) { name = value; }

    public int getNumber() { return number; }
    public void setNumber(int value) { number = value; }

    public String getId() { return id; }
    public void setId(String value) { id = value; }

    public String getCategory() { return category; }
    public void setCategory(String value) { category = value; }

    @Override
    public String convertToFlatFormat() {
        return String.format("%-7s-%10s:%05d (%s)", getId(), getName(), getNumber(), getCategory());
    }
}
