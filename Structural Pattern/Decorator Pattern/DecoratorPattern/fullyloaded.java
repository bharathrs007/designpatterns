package DecoratorPattern;

public class fullyloaded extends decorator {

	public fullyloaded(car cars) {
		super(cars);
	}
	
	public void manufacture() {
		super.manufacture();
		System.out.println("Adding components of a fully loaded car");
	}

}
