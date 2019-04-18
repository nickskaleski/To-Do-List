
public class CanadianBaconDecorator extends PizzaDecorator{
	
	public CanadianBaconDecorator(Pizza decoratedShape) {
		super(decoratedShape);
	}
	
	public void cook() {
		decoratedPizza.cook();
		addCanadianBacon(decoratedPizza);
	}
	
	private void addCanadianBacon(Pizza decoratedPizza) {
		System.out.println("adding Canadian Bacon to the pizza");
	}

}
