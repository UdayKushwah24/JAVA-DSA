package OOPs.PizzBillGeneratorProject;

public class Pizza {

    private int price;
    private Boolean veg; // if true -> veg-pizza then non-veg pizza
    private int basePizzaPrice;
    private int extraCheesePrice = 100;
    private int extraToppingsePrice = 150;
    private int backPack = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) { // veg pizza
            this.price = 300;
        } else {
            this.price = 400; // non veg pizza
        }
        basePizzaPrice = this.price;
    }

    // public void getPizzaPrice(){
    //      System.out.println(this.price);
    // }

    public void AddExtraCheese() {
        isExtraCheeseAdded = true;
        // System.out.println("Extra Cheese added.");
        this.price += extraCheesePrice;
    }

    public void AddExtraToppings() {
        isExtraToppingAdded = true;
        // System.out.println("Extra toppings added.");
        this.price += extraToppingsePrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        // System.out.println("Take away opted.");
        this.price += backPack;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza : " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingAdded) {
            bill += "Extra topping added : " + extraToppingsePrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away : " + backPack + "\n";
        }
        bill += "Bill : " + this.price + "\n";
        System.out.println(bill);
        System.out.println("----------------------END----------------------");
    }

}
