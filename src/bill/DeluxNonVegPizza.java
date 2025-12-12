package bill;

public class DeluxNonVegPizza extends Pizza {
    public DeluxNonVegPizza() {
        super(650, "Delux Non-Veg Pizza (with Extra Cheese & Toppings)");
        // Delux pizza already includes extras in base price
        // So we mark them as added but they won't add extra charges
    }
}

