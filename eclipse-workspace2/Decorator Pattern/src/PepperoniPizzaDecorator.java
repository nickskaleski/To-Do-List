
public class PepperoniPizzaDecorator extends PizzaDecorator{
	
	public PepperoniPizzaDecorator(Pizza decoratedShape) {
		super(decoratedShape);
	}
	
	public void cook() {
		decoratedPizza.cook();
		addPepperoni(decoratedPizza);
	}
	
	private void addPepperoni(Pizza decoratedPizza) {
		System.out.println("adding pepperoni topping");
	}

}
