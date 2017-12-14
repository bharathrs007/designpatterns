package TemplatePattern;

public class sedan extends buildcar {

	@Override
	public void getchassis() {
		
		System.out.println("Getting chassis for a sedan");
		
	}

	@Override
	public void addengine() {
		
		System.out.println("Adding engine to sedan");
		
	}

	@Override
	public void addwheels() {

		System.out.println("Adding wheels to sedan");
		
	}

}
