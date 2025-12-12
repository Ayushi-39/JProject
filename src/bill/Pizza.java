package bill;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private int basePrice;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int takeawayPrice = 20;
    
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayAdded = false;
    
    private String pizzaName;
    private List<String> customItems = new ArrayList<>();
    private List<Integer> customItemPrices = new ArrayList<>();
    
    public Pizza(int basePrice, String pizzaName) {
        this.basePrice = basePrice;
        this.pizzaName = pizzaName;
    }
    
    public void addExtraCheese() {
        if(!extraCheeseAdded) {
            extraCheeseAdded = true;
        }
    }
    
    public void addExtraToppings() {
        if(!extraToppingsAdded) {
            extraToppingsAdded = true;
        }
    }
    
    public void addTakeaway() {
        if(!takeawayAdded) {
            takeawayAdded = true;
        }
    }
    
    public void addCustomItem(String itemName, int price) {
        customItems.add(itemName);
        customItemPrices.add(price);
    }
    
    public String getPizzaName() {
        return pizzaName;
    }
    
    public boolean isExtraCheeseAdded() {
        return extraCheeseAdded;
    }
    
    public boolean isExtraToppingsAdded() {
        return extraToppingsAdded;
    }
    
    public void generateBill() {
        int totalAmount = basePrice;
        
        System.out.println("\n========================================");
        System.out.println("           PIZZAMANIA BILL              ");
        System.out.println("========================================");
        System.out.println("Pizza Type: " + pizzaName);
        System.out.println("Base Price: Rs. " + basePrice);
        System.out.println("----------------------------------------");
        
        if(extraCheeseAdded) {
            System.out.println("Extra Cheese: Rs. " + extraCheesePrice);
            totalAmount += extraCheesePrice;
        }
        
        if(extraToppingsAdded) {
            System.out.println("Extra Toppings: Rs. " + extraToppingsPrice);
            totalAmount += extraToppingsPrice;
        }
        
        // Display custom items
        for(int i = 0; i < customItems.size(); i++) {
            System.out.println(customItems.get(i) + ": Rs. " + customItemPrices.get(i));
            totalAmount += customItemPrices.get(i);
        }
        
        if(takeawayAdded) {
            System.out.println("Take Away Packaging: Rs. " + takeawayPrice);
            totalAmount += takeawayPrice;
        }
        
        System.out.println("========================================");
        System.out.println("TOTAL AMOUNT: Rs. " + totalAmount);
        System.out.println("========================================\n");
    }
}