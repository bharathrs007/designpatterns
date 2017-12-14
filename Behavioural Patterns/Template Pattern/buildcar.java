package TemplatePattern;

public abstract class buildcar {
	
	public abstract void getchassis();
	public abstract void addengine();
	public abstract void addwheels();
	
	public final void build() {
		getchassis();
		addengine();
		addwheels();
		System.out.println("Completed building");
	}

}
