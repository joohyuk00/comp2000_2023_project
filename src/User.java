
public class User {
    protected String name;
    protected Inventory inventory;
    protected double money;

    public User(String userName, double startingMoney, Inventory startingInventory) {
        name = userName;
        money = startingMoney;
        inventory = startingInventory;
    }

    public void addItem(ItemInterface item) {
        inventory.addOne(item);
    }

    public ItemInterface removeItem(String itemName) {
        return inventory.removeOne(itemName);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}