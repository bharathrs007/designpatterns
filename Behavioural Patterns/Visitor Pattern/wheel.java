package VisitorPattern;

public class wheel implements customizable {

	String style;
	
	public wheel(String style) {
		this.style=style;
	}
	
	@Override
	public void addtocar(customizer c) {
		
		c.addcomponent(this);
		
	}

}
