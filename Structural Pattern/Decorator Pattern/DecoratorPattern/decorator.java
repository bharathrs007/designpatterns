package DecoratorPattern;

public class decorator implements car {

	car cardemo;
	
	public decorator(car cars) {
		this.cardemo=cars;
	}
	
	@Override
	public void manufacture() {
		
		
		this.cardemo.manufacture();
		
		
	}

}
