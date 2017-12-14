package TemplatePattern;

public class hatchback extends buildcar {

	@Override
	public void getchassis() {
		
		System.out.println("Getting chassis for a hatchback");
		
	}

	@Override
	public void addengine() {
		
		System.out.println("Adding engine to hatchback");
		
	}

	@Override
	public void addwheels() {
		
		System.out.println("Adding wheels to hatchback");
		
	}

}
