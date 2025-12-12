package bill;

import java.util.Scanner;

public class PizzaBillGenerator {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║    WELCOME TO PIZZAMANIA 🍕           ║");
        System.out.println("║    Your Favorite Pizza Destination     ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Display menu
        displayMainMenu();
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        
        Pizza pizza = createPizza(choice);
        
        if(pizza == null) {
            System.out.println("Invalid choice! Please restart the application.");
            sc.close();
            return;
        }
        
        System.out.println("\nYou selected: " + pizza.getPizzaName());
        
        // For regular pizzas, ask for extras
        if(choice == 1 || choice == 2) {
            askForExtras(pizza);
        } else {
            System.out.println("Note: Your Delux Pizza already includes Extra Cheese & Toppings!");
        }
        
        // Ask for additional items in a loop
        askForAdditionalItems(pizza);
        
        // Ask for takeaway
        System.out.print("\nWant Take Away packaging (y/n)? => ");
        char takeawayChoice = sc.next().toLowerCase().charAt(0);
        if(takeawayChoice == 'y') {
            pizza.addTakeaway();
            System.out.println("✓ Take away packaging added!");
        }
        
        // Generate and print bill
        pizza.generateBill();
        
        System.out.println("═══════════════════════════════════════");
        System.out.println("   Thank you for choosing Pizzamania!  ");
        System.out.println("        Visit us again! 🍕❤️          ");
        System.out.println("═══════════════════════════════════════\n");
        
        sc.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│           PIZZA MENU                    │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│  1. Veg Pizza              - Rs. 300    │");
        System.out.println("│  2. Non-Veg Pizza          - Rs. 400    │");
        System.out.println("│  3. Delux Veg Pizza        - Rs. 550    │");
        System.out.println("│     (Extra Cheese & Toppings Included)  │");
        System.out.println("│  4. Delux Non-Veg Pizza    - Rs. 650    │");
        System.out.println("│     (Extra Cheese & Toppings Included)  │");
        System.out.println("└─────────────────────────────────────────┘");
    }
    
    private static Pizza createPizza(int choice) {
        switch(choice) {
            case 1:
                return new VegPizza();
            case 2:
                return new NonVegPizza();
            case 3:
                return new DeluxVegPizza();
            case 4:
                return new DeluxNonVegPizza();
            default:
                return null;
        }
    }
    
    private static void askForExtras(Pizza pizza) {
        System.out.print("\nWant Extra Cheese (y/n)? => ");
        char cheeseChoice = sc.next().toLowerCase().charAt(0);
        if(cheeseChoice == 'y') {
            pizza.addExtraCheese();
            System.out.println("✓ Extra cheese added!");
        }
        
        System.out.print("Want Extra Toppings (y/n)? => ");
        char toppingChoice = sc.next().toLowerCase().charAt(0);
        if(toppingChoice == 'y') {
            pizza.addExtraToppings();
            System.out.println("✓ Extra toppings added!");
        }
    }
    
    private static void askForAdditionalItems(Pizza pizza) {
        boolean addingItems = true;
        
        while(addingItems) {
            System.out.print("\nWant to add any additional items? (y/n) => ");
            char addMore = sc.next().toLowerCase().charAt(0);
            
            if(addMore == 'y') {
                displayAdditionalItemsMenu();
                System.out.print("Enter your choice (1-6, or 0 for custom item): ");
                int itemChoice = sc.nextInt();
                
                if(itemChoice == 0) {
                    // Custom item
                    sc.nextLine(); // consume newline
                    System.out.print("Enter item name: ");
                    String customItemName = sc.nextLine();
                    System.out.print("Enter item price: Rs. ");
                    int customPrice = sc.nextInt();
                    pizza.addCustomItem(customItemName, customPrice);
                    System.out.println("✓ " + customItemName + " added to your order!");
                } else {
                    String itemName = getAdditionalItemName(itemChoice);
                    int itemPrice = getAdditionalItemPrice(itemChoice);
                    
                    if(itemName != null) {
                        pizza.addCustomItem(itemName, itemPrice);
                        System.out.println("✓ " + itemName + " added to your order!");
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
            } else {
                addingItems = false;
            }
        }
    }
    
    private static void displayAdditionalItemsMenu() {
        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│      ADDITIONAL ITEMS MENU              │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│  1. Garlic Bread           - Rs. 80     │");
        System.out.println("│  2. Cheese Dip             - Rs. 50     │");
        System.out.println("│  3. Cold Drink (Can)       - Rs. 40     │");
        System.out.println("│  4. Chicken Wings (6 pcs)  - Rs. 180    │");
        System.out.println("│  5. French Fries           - Rs. 90     │");
        System.out.println("│  6. Chocolate Lava Cake    - Rs. 120    │");
        System.out.println("│  0. Custom Item (Enter your own)        │");
        System.out.println("└─────────────────────────────────────────┘");
    }
    
    private static String getAdditionalItemName(int choice) {
        switch(choice) {
            case 1: return "Garlic Bread";
            case 2: return "Cheese Dip";
            case 3: return "Cold Drink (Can)";
            case 4: return "Chicken Wings (6 pcs)";
            case 5: return "French Fries";
            case 6: return "Chocolate Lava Cake";
            default: return null;
        }
    }
    
    private static int getAdditionalItemPrice(int choice) {
        switch(choice) {
            case 1: return 80;
            case 2: return 50;
            case 3: return 40;
            case 4: return 180;
            case 5: return 90;
            case 6: return 120;
            default: return 0;
        }
    }
}