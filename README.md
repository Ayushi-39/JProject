# 🍕 Pizzamania - Pizza Bill Generator

A comprehensive Java-based pizza billing system that automates the ordering and billing process for a pizza outlet. This application features an interactive menu-driven interface with support for multiple pizza variants, customizable add-ons, and dynamic item additions.

## 📋 Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Installation & Setup](#installation--setup)
- [How to Use](#how-to-use)
- [Menu Options](#menu-options)
- [Sample Output](#sample-output)
- [OOP Concepts Applied](#oop-concepts-applied)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- **4 Pizza Variants**:
  - Veg Pizza (Rs. 300)
  - Non-Veg Pizza (Rs. 400)
  - Delux Veg Pizza (Rs. 550) - Includes extra cheese & toppings
  - Delux Non-Veg Pizza (Rs. 650) - Includes extra cheese & toppings

- **Customization Options**:
  - Extra Cheese (+Rs. 100)
  - Extra Toppings (+Rs. 150)
  - Take Away Packaging (+Rs. 20)

- **Additional Items Menu**:
  - Garlic Bread (Rs. 80)
  - Cheese Dip (Rs. 50)
  - Cold Drink (Rs. 40)
  - Chicken Wings (Rs. 180)
  - French Fries (Rs. 90)
  - Chocolate Lava Cake (Rs. 120)
  - Custom items with user-defined prices

- **Dynamic Ordering**: Add multiple items to your order
- **Professional Bill Format**: Clean and formatted bill generation
- **User-Friendly Interface**: Interactive prompts and confirmations

## 📁 Project Structure

```
PizzaBillGenerator/
├── src/
│   ├── Pizza.java                 # Base class with common properties
│   ├── VegPizza.java              # Veg pizza implementation
│   ├── NonVegPizza.java           # Non-veg pizza implementation
│   ├── DeluxVegPizza.java         # Delux veg pizza with extras
│   ├── DeluxNonVegPizza.java      # Delux non-veg pizza with extras
│   └── PizzaBillGenerator.java    # Main class with menu logic
└── README.md
```

## 🛠️ Technologies Used

- **Language**: Java (Core Java)
- **IDE**: Eclipse IDE / Any Java IDE
- **JDK Version**: Java 8 or higher
- **Concepts**: Object-Oriented Programming (OOP)

## 🚀 Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Eclipse IDE or any Java IDE

### Steps to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/pizzamania-bill-generator.git
   cd pizzamania-bill-generator
   ```

2. **Open in Eclipse IDE**
   - File → Open Projects from File System
   - Select the project folder
   - Click Finish

3. **Run the Application**
   - Right-click on `PizzaBillGenerator.java`
   - Select "Run As" → "Java Application"

### Alternative: Command Line Execution

```bash
# Compile
javac *.java

# Run
java PizzaBillGenerator
```

## 📖 How to Use

1. **Launch the Application**: Run `PizzaBillGenerator.java`

2. **Select Your Pizza**: Choose from 4 pizza options (1-4)

3. **Add Extras** (for regular pizzas): 
   - Extra Toppings (y/n)
   - Extra Cheese (y/n)

4. **Add Additional Items**: 
   - Choose from pre-defined menu
   - Or add custom items
   - Add multiple items as needed

5. **Choose Take Away**: Select packaging option (y/n)

6. **Get Your Bill**: View detailed bill with total amount

## 🍽️ Menu Options

### Main Pizza Menu
| Pizza Type | Base Price | Extras Included |
|------------|-----------|-----------------|
| Veg Pizza | Rs. 300 | No |
| Non-Veg Pizza | Rs. 400 | No |
| Delux Veg Pizza | Rs. 550 | Yes (Cheese + Toppings) |
| Delux Non-Veg Pizza | Rs. 650 | Yes (Cheese + Toppings) |

### Additional Items
| Item | Price |
|------|-------|
| Garlic Bread | Rs. 80 |
| Cheese Dip | Rs. 50 |
| Cold Drink | Rs. 40 |
| Chicken Wings | Rs. 180 |
| French Fries | Rs. 90 |
| Chocolate Lava Cake | Rs. 120 |

## 📊 Sample Output

```
╔════════════════════════════════════════╗
║    WELCOME TO PIZZAMANIA 🍕           ║
║    Your Favorite Pizza Destination     ║
╚════════════════════════════════════════╝

┌─────────────────────────────────────────┐
│           PIZZA MENU                    │
├─────────────────────────────────────────┤
│  1. Veg Pizza              - Rs. 300    │
│  2. Non-Veg Pizza          - Rs. 400    │
│  3. Delux Veg Pizza        - Rs. 550    │
│     (Extra Cheese & Toppings Included)  │
│  4. Delux Non-Veg Pizza    - Rs. 650    │
│     (Extra Cheese & Toppings Included)  │
└─────────────────────────────────────────┘

Enter your choice (1-4): 1
You selected: Veg Pizza

Want Extra Toppings (y/n)? => y
✓ Extra toppings added!
Want Extra Cheese (y/n)? => y
✓ Extra cheese added!

Want to add any additional items? (y/n) => y
...

========================================
           PIZZAMANIA BILL              
========================================
Pizza Type: Veg Pizza
Base Price: Rs. 300
----------------------------------------
Extra Cheese: Rs. 100
Extra Toppings: Rs. 150
Garlic Bread: Rs. 80
Cold Drink (Can): Rs. 40
Take Away Packaging: Rs. 20
========================================
TOTAL AMOUNT: Rs. 690
========================================
```

## 🎓 OOP Concepts Applied

- **Inheritance**: All pizza classes extend the base `Pizza` class
- **Encapsulation**: Private fields with public methods
- **Polymorphism**: Method overriding in Delux pizza classes
- **Abstraction**: Common behavior in base class, specific implementation in subclasses

## 🔮 Future Enhancements

- [ ] Add database connectivity for order history
- [ ] Implement discount coupons and offers
- [ ] Add user authentication for repeat customers
- [ ] Generate PDF bills
- [ ] Add GUI using JavaFX or Swing
- [ ] Online payment integration
- [ ] Order tracking system
- [ ] Multiple size options (Small, Medium, Large)
- [ ] GST calculation and invoice generation

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Your Name**
- GitHub: [@yourusername](https://github.com/Ayushi-39)
- Email: ayushiuikey40480@gmail.com

## 🙏 Acknowledgments

- Inspired by real-world pizza ordering systems
- Built as a Java learning project
- Thanks to the open-source community

---

⭐ **If you like this project, please give it a star!** ⭐

Made with ❤️ and Java ☕
