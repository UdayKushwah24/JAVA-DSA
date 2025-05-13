package OOPs.PizzBillGeneratorProject;

 

public class DeluxePizza extends Pizza{

    public DeluxePizza(Boolean veg) {
        super(veg);
        super.AddExtraCheese();
        super.AddExtraToppings();
    }

    @Override
    public void AddExtraCheese() {
        
    }

    @Override
    public void AddExtraToppings() {
        
    }
  
    
    
    
}
