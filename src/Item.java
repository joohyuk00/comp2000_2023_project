public class Item {
    private String name;
    private String description;
    private double value;
    private int expiration;

    public Item(String name, String description, double value, int expiration) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public int getExpiration() {
        return expiration;
    }
}