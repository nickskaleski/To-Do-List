
public class main {

	public static void main(String[] args) {
		
		Pizza DeepDish = new DeepDish();
		Pizza SausageDeepDish = new SausagePizzaDecorator(new DeepDish());
		Pizza ThinCrust = new SausagePizzaDecorator(new ThinCrust());
		Pizza PepperoniThinCrust = new PepperoniPizzaDecorator(new ThinCrust());
		Pizza CanadianBaconThinCrust = new CanadianBaconDecorator(new ThinCrust());
		Pizza SausAndPepDeepDish = new SausAndPepDecorator(new DeepDish());
		
		System.out.println("regular deep dish pizza with no toppings");
		DeepDish.cook();
		System.out.println();
		
		System.out.println("Deep dish pizza with Sausage topping");
		SausageDeepDish.cook();
		System.out.println();
		
		System.out.println("thin crust pizza with sausage topping");
		ThinCrust.cook();
		System.out.println();
		
		System.out.println("thin crust pizza with pepperoni");
		PepperoniThinCrust.cook();
		System.out.println();
		
		System.out.println("thin crust pizza with Canadian bacon");
		CanadianBaconThinCrust.cook();
		System.out.println();
		
		System.out.println("deep dish pizza with sausage and pepperoni");
		SausAndPepDeepDish.cook();
	}
}
