
public class SausagePizzaDecorator extends PizzaDecorator{

	public SausagePizzaDecorator(Pizza decoratedShape) {
		super(decoratedShape);
	}
	
	public void cook() {
		decoratedPizza.cook();
		addSausage(decoratedPizza);
	}
	
	private void addSausage(Pizza decoratedPizza) {
		System.out.println("adding sausage topping");
	}
}
