package VisitorPattern;

public class windowshield implements customizable{
	
	String color;
	
	public windowshield(String color) {
		this.color=color;
	}

	@Override
	public void addtocar(customizer c) {
		
		c.addcomponent(this);
		
	}
	

}
