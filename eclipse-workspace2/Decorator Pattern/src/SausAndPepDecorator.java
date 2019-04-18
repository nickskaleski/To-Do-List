
public class SausAndPepDecorator extends PizzaDecorator{
	
	public SausAndPepDecorator(Pizza decoratedShape) {
		super(decoratedShape);
	}
	
	public void cook() {
		decoratedPizza.cook();
		addSausage(decoratedPizza);
		addPepperoni(decoratedPizza);
	}
	
	private void addSausage(Pizza decoratedPizza) {
		System.out.println("adding sausage to the pizza");
	}
	
	private void addPepperoni(Pizza decoratedPizza) {
		System.out.println("adding pepperoni to the pizza");
	}
}
