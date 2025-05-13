package OOPs.PizzBillGeneratorProject;

public class Client {
    public static void main(String[] args) {
      /*   Pizza basePizza = new Pizza(false);
        // basePizza.getClass();
        basePizza.AddExtraCheese();
        basePizza.AddExtraToppings();
        basePizza.takeAway();
        basePizza.getBill(); */

        DeluxePizza dp = new DeluxePizza(true);
        dp.AddExtraCheese();
        dp.AddExtraToppings();
        dp.getBill();

    }
    static {
        System.out.println("------------------------------------------------");
        System.out.println("\tWelcome to -:|| Uday Pizza ||:-");
        System.out.println("------------------------------------------------");
    }
}
