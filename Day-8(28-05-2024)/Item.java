public class Item {
    private String itemId, name;
    private int quantity;
    private double price;
    public Item(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void updateQuantity(int amount) { this.quantity += amount; }
    public void displayItemDetails() {
        System.out.printf("Item ID: %s, Name: %s, Quantity: %d, Price: $%.2f%n", itemId, name, quantity, price);
    }
    public static void main(String[] args) {
        Item item1 = new Item("001", "Ac", 6, 1000.99);
        Item item2 = new Item("002", "Fridge", 17, 599.99);
        item1.displayItemDetails();
        item2.displayItemDetails();
        item1.updateQuantity(5);
        item2.updateQuantity(-3);

    }
}
