package bill;

public class DeluxVegPizza extends Pizza {
    public DeluxVegPizza() {
        super(550, "Delux Veg Pizza (with Extra Cheese & Toppings)");
        // Delux pizza already includes extras in base price
        // So we mark them as added but they won't add extra charges
    }
}
