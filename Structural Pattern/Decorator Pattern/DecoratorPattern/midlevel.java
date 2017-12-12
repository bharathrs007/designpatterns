package DecoratorPattern;

public class midlevel extends decorator {

	public midlevel(car cars) {
		super(cars);
	}
	
	public void manufacture() {
		super.manufacture();
		System.out.println("Adding components of a mid level car");
	}

}
